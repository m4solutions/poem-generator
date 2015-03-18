package co.m4solutions.grammars.generator;

import java.util.List;

import co.m4solutions.grammars.model.NonTerminalToken;
import co.m4solutions.grammars.model.Token;

public class GeneratedSentence {
	
	private List<Token> generatedSentence;

	public List<Token> getGeneratedSentence() {
		return generatedSentence;
	}

	public void setGeneratedSentence(List<Token> generatedSentence) {
		this.generatedSentence = generatedSentence;
	}

	public boolean isCompleted() {
		
		for (Token token : generatedSentence) {
			if(token instanceof NonTerminalToken){
				return false;
			}
		}
		return true;
	}

	
	@Override
	public String toString() {
		String name = "";
		for (Token token : generatedSentence) {
			name += token.toString();
		}
		return name.trim()+"\n";
	}

	
}
