package lsystems;

public class A_AA extends LRule  {

	@Override
	public char getMatch() {
		
		return 'A';
	}

	@Override
	public char[] getBody() {
		char[] seq = {'A', 'A'};
		return seq;
	}

}
