package co.m4solutions.grammars.generator;

import co.m4solutions.grammars.model.Token;
import co.m4solutions.grammars.model.TokenGroup;
import co.m4solutions.grammars.model.TokenOperator;

public class RandomTokenGroupChooser {

	public static Token choose(TokenGroup group, GeneratorLimitAdvisor advisor) {
		if (group.getOperator().equals(TokenOperator.OR)){//The only one by now
		    
		    
		    
			int choosenTokenIndex = 0 + (int)(Math.random() * ((group.getTokens().size()-1) + 1));
			Token choosen = group.getTokens().get(choosenTokenIndex);
			
//			if(choosen instanceof NonTerminalToken){
//			     choosenTokenIndex = 0 + (int)(Math.random() * ((group.getTokens().size()-1) + 1));
//	             choosen = group.getTokens().get(choosenTokenIndex);
//			}
//			
//	        if(choosen instanceof NonTerminalToken){
//                 choosenTokenIndex = 0 + (int)(Math.random() * ((group.getTokens().size()-1) + 1));
//                 choosen = group.getTokens().get(choosenTokenIndex);
//            }
			return choosen;
		}
		return group;
	}

}
