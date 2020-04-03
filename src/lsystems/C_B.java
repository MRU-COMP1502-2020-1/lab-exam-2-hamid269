package lsystems;

public class C_B extends LRule {

	@Override
	public char getMatch() {
		
		return 'C';
	}

	@Override
	public char[] getBody() {
		char[] seq = {'B'}; 
		return seq;
	}

}
