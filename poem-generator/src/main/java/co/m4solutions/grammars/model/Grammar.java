package co.m4solutions.grammars.model;

import java.util.HashMap;
import java.util.List;

public class Grammar {

	private static final ThreadLocal<TokenHolder> threadLocalTokenHolder = new ThreadLocal<TokenHolder>();


	public static TokenHolder getTokenHolder(){
		return threadLocalTokenHolder.get();
	}

	Production initialProduction = null;
	
	List<Production> rules;

	TokenHolder tokens;
	
	public Grammar() {
		tokens = new TokenHolder();
		tokens.keyWords = new HashMap<String, KeyWord>();
		tokens.nonTerminalTokens = new HashMap<String, NonTerminalToken>();
		tokens.terminalTokens = new HashMap<String, TerminalToken>();
		threadLocalTokenHolder.set(tokens);
	}

	

	public Production getInitialProduction() {
		return initialProduction;
	}


	public List<Production> getRules() {
		return rules;
	}

	public TokenHolder getTokens() {
		return tokens;
	}

	public void setInitialProduction(Production initialProduction) {
		this.initialProduction = initialProduction;
	}



	public void setRules(List<Production> rules) {
		this.rules = rules;
	}

	public void setTokens(TokenHolder tokens) {
		this.tokens = tokens;
	}
	
	public Production getProductionByReductionToken(Token token){
		for (Production production : rules) {
			if(production.getReductionToken().equals(token)){
				return production;
			}
		}
		return null;
	}

}
