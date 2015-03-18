package co.m4solutions.grammars.service;

import java.util.ArrayList;
import java.util.StringTokenizer;

import co.m4solutions.grammars.model.Grammar;
import co.m4solutions.grammars.model.GrammarRule;
import co.m4solutions.grammars.model.NonTerminalToken;
import co.m4solutions.grammars.model.Production;
import co.m4solutions.grammars.model.Token;

public class ProductionFactory {
	
	public static Production buildProduction(String line, Grammar g){
		Production production = new Production();
		
		StringTokenizer tokenizer = new StringTokenizer(line);
		String nonTerminalTokenStr = tokenizer.nextToken(":");
		production.setReductionToken(new NonTerminalToken(nonTerminalTokenStr));
		production.setGrammarRule(new GrammarRule());
		production.getGrammarRule().setRuleElements(new ArrayList<Token>());
		tokenizer = new StringTokenizer(tokenizer.nextToken(":"));
				while(tokenizer.hasMoreElements()){
					String token = tokenizer.nextToken(" ");
					if(token.contains("|")){
						production.getGrammarRule().getRuleElements().add(TokenGroupFactory.buildTokenGroup(token));
					}else{
						production.getGrammarRule().getRuleElements().add(TokenFactory.buildToken(token));
					}
				}
		return production;
	}

}
