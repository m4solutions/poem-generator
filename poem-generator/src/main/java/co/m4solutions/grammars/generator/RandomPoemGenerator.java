package co.m4solutions.grammars.generator;

public interface RandomPoemGenerator {
	
	public boolean init(String grammarFile);
	
	public String generate();
}
