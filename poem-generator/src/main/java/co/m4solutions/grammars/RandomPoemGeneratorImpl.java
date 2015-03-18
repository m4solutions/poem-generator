package co.m4solutions.grammars;

import java.io.BufferedReader;

import co.m4solutions.grammars.generator.GrammarBasedSentenceGenerator;
import co.m4solutions.grammars.generator.RandomPoemGenerator;
import co.m4solutions.grammars.model.Grammar;
import co.m4solutions.grammars.service.GrammarFactory;
import co.m4solutions.grammars.service.GrammarFileReader;

public class RandomPoemGeneratorImpl implements RandomPoemGenerator {
	
	Grammar grammar;
	GrammarBasedSentenceGenerator generator = new GrammarBasedSentenceGenerator();

	@Override
	public boolean init(String grammarFile) {
		BufferedReader in = GrammarFileReader.readFile(grammarFile);
		grammar = GrammarFactory.buildGrammar(in);	
		return true;
	}

	@Override
	public String generate() {
		String poem = generator.generate(grammar);
		System.out.println("Final Poem\n*******************************************");
		System.out.print(poem);
		System.out.println("\n*******************************************\nFinal Poem");
		return poem;
	}

}
