package co.m4solutions.grammars.test;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;
import org.junit.Test;

import co.m4solutions.grammars.RandomPoemGeneratorImpl;
import co.m4solutions.grammars.antl4.test.PoemLexer;
import co.m4solutions.grammars.antl4.test.PoemParser;
import co.m4solutions.grammars.antl4.test.PoemParser.PoemContext;
import co.m4solutions.grammars.generator.RandomPoemGenerator;

public class PoemGeneratorTest {

	class AvoidLinreBreaksErrorsStrategy extends DefaultErrorStrategy {
		@Override
		public void reportError(Parser arg0, RecognitionException exception) {
			if (!"\n".equals(exception.getOffendingToken().getText())) {
				// throw an exceptions only when is not an return carriage
				// problem
				throw new RuntimeException("Sentence not recognized"
						+ exception.getOffendingToken().getText());
			}
		}

	}

	@Test
	public void testPoemHappyPath() throws IOException, RecognitionException {
		RandomPoemGenerator poemGenerator = new RandomPoemGeneratorImpl();
		System.out.println("Grammar Initialized: "
				+ poemGenerator.init("src/main/resources/GrammarInput.txt"));
		String poem = poemGenerator.generate();
		PoemParser parser = generateParser(poem);
		PoemContext poemContext = parser.poem();
		// The only way for the interpreted poem to contain the whole generated
		// poem is to have interpreted it completely
		Assert.assertTrue(poemContext.getText().contains(poem));
	}

	private PoemParser generateParser(String poem) {
		PoemLexer lexer = new PoemLexer(new ANTLRInputStream(poem));
		PoemParser parser = new PoemParser(new CommonTokenStream(lexer));
		return parser;
	}

	@Test
	public void testWrongInput() {
		String poem = "100This is not a poem200\n this is not300 a poem400\n\n\n";
		PoemParser parser = generateParser(poem);
		PoemContext poemContext = parser.poem();
		// The only way for the interpreted poem to contain the whole generated
		// poem is to have interpreted it completely		
		Assert.assertFalse(poemContext.getText().contains(poem));
	}

}
