package co.m4solutions.grammars.model;

import java.util.List;

public class TokenGroup extends NonTerminalToken{

	TokenOperator operator;
	
	List<Token> tokens;

	public TokenGroup(String name) {
		super(name);
	}

	public String getName(){
		String name = "";
		for (Token token : tokens) {
			name+=token.getName() + " ";
		}
		return name;
	}

	public TokenOperator getOperator() {
		return operator;
	}

	public List<Token> getTokens() {
		return tokens;
	}

	public void setOperator(TokenOperator operator) {
		this.operator = operator;
	}

	public void setTokens(List<Token> tokens) {
		this.tokens = tokens;
	}
	
	@Override
	public String toString() {
		String toString="";
		for (Token token : tokens) {
			toString+=token.toString() + "|";
		}
		return toString.substring(0, toString.length()-2);
	}

}
