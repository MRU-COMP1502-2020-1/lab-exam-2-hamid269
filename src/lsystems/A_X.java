package lsystems;

public class A_X extends LRule {

	@Override
	public char getMatch() {
		
		return 'A';
	}

	@Override
	public char[] getBody() {
		char[] seq = {'A',  };
		return seq;
	}
}