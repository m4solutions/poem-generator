package co.m4solutions.grammars.model;

public abstract class Token {

	private String name;
	
	public Token(String name) {
		this.name =name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		return name.equals(((Token)obj).name);
	}
	
	@Override
	public String toString() {
		return name + " ";
	}

}
