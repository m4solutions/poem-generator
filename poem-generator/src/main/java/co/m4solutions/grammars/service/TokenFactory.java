package co.m4solutions.grammars.service;

import co.m4solutions.grammars.model.Grammar;
import co.m4solutions.grammars.model.KeyWord;
import co.m4solutions.grammars.model.NonTerminalToken;
import co.m4solutions.grammars.model.TerminalToken;
import co.m4solutions.grammars.model.Token;

public class TokenFactory {

	public static Token buildToken(String tk) {
		tk = tk.trim();
		if(tk.contains("<")){
			tk = tk.replaceAll("<", "").replaceAll(">", "").trim();
			Token tokenObj = Grammar.getTokenHolder().getToken(tk);
			if(tokenObj!=null){
				return tokenObj;
			}else{
				tokenObj = new NonTerminalToken(tk);
				Grammar.getTokenHolder().addToken(tokenObj);
				return tokenObj;
			}
			
		}
		
		if(tk.contains("$")){
			tk = tk.replaceAll("\\$", "").trim();
			
			Token tokenObj = Grammar.getTokenHolder().getToken(tk);
			if(tokenObj!=null){
				return tokenObj;
			}else{
				tokenObj = new KeyWord(tk);
				Grammar.getTokenHolder().addToken(tokenObj);
				return tokenObj;
			}
		}
		
		Token tokenObj = Grammar.getTokenHolder().getToken(tk);
		if(tokenObj!=null){
			return tokenObj;
		}else{
			tokenObj = new TerminalToken(tk);
			Grammar.getTokenHolder().addToken(tokenObj);
			return tokenObj;
		}
	}

}
