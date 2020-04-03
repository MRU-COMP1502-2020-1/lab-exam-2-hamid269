package lsystems;

import static org.junit.Assert.*;

import org.junit.Test;

public class A_QTest {

	@Test
	public void testGetMatch() {
		A_Q a = new A_Q(); 		
		assertEquals("testing match",'Q',a.getMatch()); 
	}

	@Test
	public void testGetBody() {
		fail("Not yet implemented");
	}

}
