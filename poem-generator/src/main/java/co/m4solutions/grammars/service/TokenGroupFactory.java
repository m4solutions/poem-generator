package co.m4solutions.grammars.service;

import java.util.ArrayList;
import java.util.StringTokenizer;

import co.m4solutions.grammars.model.Token;
import co.m4solutions.grammars.model.TokenGroup;
import co.m4solutions.grammars.model.TokenOperator;

public class TokenGroupFactory {

	public static Token buildTokenGroup(String token) {
		TokenGroup tokenGroup = new TokenGroup("");
		tokenGroup.setOperator(TokenOperator.OR); //Is the only one supported by now.
		tokenGroup.setTokens(new ArrayList<Token>());
		StringTokenizer tokenizer = new StringTokenizer(token);
		while(tokenizer.hasMoreElements()){
			String tk = tokenizer.nextToken("|");	
			tokenGroup.getTokens().add(TokenFactory.buildToken(tk));
		}
		return tokenGroup;
	}

}
