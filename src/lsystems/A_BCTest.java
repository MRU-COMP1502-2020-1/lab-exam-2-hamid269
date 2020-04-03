package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_BCTest {

	@Test
	public void testGetMatch() {
		A_BC a = new A_BC(); 		
		assertEquals("testing match",'A',a.getMatch()); 
	}

	@Test
	public void testGetBody() {
		A_BC a = new A_BC();
		assertEquals("testing match","BC" ,a.getBody()); 	}

}
