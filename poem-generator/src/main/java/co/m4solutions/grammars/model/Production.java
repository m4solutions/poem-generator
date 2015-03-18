package co.m4solutions.grammars.model;


public class Production{

	NonTerminalToken reductionToken;
	
	GrammarRule grammarRule;

	public NonTerminalToken getReductionToken() {
		return reductionToken;
	}

	public void setReductionToken(NonTerminalToken reductionToken) {
		this.reductionToken = reductionToken;
	}

	public GrammarRule getGrammarRule() {
		return grammarRule;
	}

	public void setGrammarRule(GrammarRule grammarRule) {
		this.grammarRule = grammarRule;
	}
	
	
}
