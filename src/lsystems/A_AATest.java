package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_AATest {

	@Test
	public void testGetMatch() {
		A_AA a = new A_AA(); 		
		assertEquals("testing match",'A',a.getMatch()); 
	}

	@Test
	public void testGetBody() {
		A_BC a = new A_BC();
		char [] list = a.getBody(); 		 
		assertEquals('A', list[0]);  	}

}
