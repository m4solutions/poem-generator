package co.m4solutions.grammars.generator;

import java.util.ArrayList;
import java.util.List;

import co.m4solutions.grammars.model.Grammar;
import co.m4solutions.grammars.model.GrammarRule;
import co.m4solutions.grammars.model.NonTerminalToken;
import co.m4solutions.grammars.model.Production;
import co.m4solutions.grammars.model.Token;
import co.m4solutions.grammars.model.TokenGroup;

public class GrammarBasedSentenceGenerator {

	private static final ThreadLocal<GeneratorLimitAdvisor> threadLocalAdvisor = new ThreadLocal<GeneratorLimitAdvisor>();

	public static int getNumberOfNonTerminalTokens() {
		return threadLocalAdvisor.get().numberOfNonTerminalTokens;
	}

	public static void increaseNumberOfNonTerminalTokens() {
		threadLocalAdvisor.get().numberOfNonTerminalTokens++;
	}

	public static void increaseNumberOfNonTerminalTokens(int plus) {
		threadLocalAdvisor.get().numberOfNonTerminalTokens += plus;
	}

	private GeneratorLimitAdvisor advisor;

	private GeneratedSentence sentence;
	
	private Grammar grammar;

	public GrammarBasedSentenceGenerator() {
		GeneratorLimitAdvisor advisor = new GeneratorLimitAdvisor();
		threadLocalAdvisor.set(advisor);
		sentence = new GeneratedSentence();
	}

	public String generate(Grammar grammar) {
		this.grammar = grammar;
		Production initialProduction = grammar.getInitialProduction();
		sentence.setGeneratedSentence(initialProduction.getGrammarRule().getRuleElements());
		while (!sentence.isCompleted()) {
			simplifySentence();
		}
		return sentence.toString().replaceAll(" LINEBREAK ", "\n").replaceAll(" LINEBREAK", "\n").replace(" END", "").replaceAll("\n\n", "\n");//.replaceAll(" ", "-").replaceAll("\n", "*\n");
		//
	}

	private void simplifySentence() {
		List<Token> tmp = new ArrayList<Token>();
		for (Token token : sentence.getGeneratedSentence()) {
			tmp.addAll(translateNonTerminalToken(token));
		}
		sentence.setGeneratedSentence(tmp);
	}
	
	private List<Token> translateNonTerminalToken(Token tokenObj) {
		if (!(tokenObj instanceof NonTerminalToken)) {
			return tokenToTokenList(tokenObj);
		}

		if (tokenObj instanceof TokenGroup) {
			return tokenToTokenList(RandomTokenGroupChooser.choose((TokenGroup) tokenObj, advisor));
		}
		
		if (tokenObj instanceof NonTerminalToken) {
			Production production = grammar.getProductionByReductionToken(tokenObj);
			GrammarRule rule = production.getGrammarRule();
			List<Token> translation = rule.getRuleElements();
			//System.out.println("FROM: " + tokenObj.getName() + "   TO:  " + translation);
			return translation;
		}
		
		return tokenToTokenList(tokenObj);
	}
	
	private List<Token> tokenToTokenList(Token token){
		List<Token> listToken = new ArrayList<Token>();
		listToken.add(token);
		return listToken;
	}

}
