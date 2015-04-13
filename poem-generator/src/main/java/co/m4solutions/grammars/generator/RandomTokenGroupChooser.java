package co.m4solutions.grammars.generator;

import co.m4solutions.grammars.model.Token;
import co.m4solutions.grammars.model.TokenGroup;
import co.m4solutions.grammars.model.TokenOperator;

public class RandomTokenGroupChooser {

	public static Token choose(TokenGroup group, GeneratorLimitAdvisor advisor) {
		if (group.getOperator().equals(TokenOperator.OR)){//The only one by now
		
			//Here is where the "magic" happens, for the next version this choice should be driven 
			//not by random numbers, but by hints of gramatically correctnes secuences.
			int choosenTokenIndex = 0 + (int)(Math.random() * ((group.getTokens().size()-1) + 1));
			Token choosen = group.getTokens().get(choosenTokenIndex);
			return choosen;
		}
		return group;
	}

}
