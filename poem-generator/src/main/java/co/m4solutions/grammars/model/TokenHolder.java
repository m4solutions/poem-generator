package co.m4solutions.grammars.model;

import java.util.Map;

public class TokenHolder {
	
	Map<String, KeyWord> keyWords;
	
	Map<String, TerminalToken> terminalTokens;
	
	Map<String, NonTerminalToken> nonTerminalTokens;
	
	
	public void addToken(Token token){
		if(token instanceof KeyWord){
			keyWords.put(token.getName(), (KeyWord)token);
		}
		
		if(token instanceof TerminalToken){
			terminalTokens.put(token.getName(), (TerminalToken)token);
		}
		
		if(token instanceof NonTerminalToken){
			nonTerminalTokens.put(token.getName(), (NonTerminalToken)token);
		}
	}
	
	public Token getToken(String token){
		
		if(keyWords.containsKey(token)){
			return keyWords.get(token);
		}
		
		if(terminalTokens.containsKey(token)){
			return terminalTokens.get(token);
		}
		
		if(nonTerminalTokens.containsKey(token)){
			return nonTerminalTokens.get(token);
		}
		return null;
	}

	public Map<String, KeyWord> getKeyWords() {
		return keyWords;
	}

	public void setKeyWords(Map<String, KeyWord> keyWords) {
		this.keyWords = keyWords;
	}

	public Map<String, TerminalToken> getTerminalTokens() {
		return terminalTokens;
	}

	public void setTerminalTokens(Map<String, TerminalToken> terminalTokens) {
		this.terminalTokens = terminalTokens;
	}

	public Map<String, NonTerminalToken> getNonTerminalTokens() {
		return nonTerminalTokens;
	}

	public void setNonTerminalTokens(Map<String, NonTerminalToken> nonTerminalTokens) {
		this.nonTerminalTokens = nonTerminalTokens;
	}
	
	

}
