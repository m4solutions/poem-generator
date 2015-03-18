package co.m4solutions.grammars.model;

public class KeyWord extends TerminalToken {

	public KeyWord(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
//		if("LINEBREAK".equals(getName())){
//			return "\n";
//		}
//		if("END".equals(getName())){
//			return "";
//		}	
		return super.toString();
	}

}
