package lsystems;  
public class LSystemSymbolException extends Exception 
{ 
	private char invalid; 
	public LSystemSymbolException(char ch) 
	{ 	
		invalid = ch; 	
		} 
	public char getSymbol() { 	
		return invalid ; } 
	}
