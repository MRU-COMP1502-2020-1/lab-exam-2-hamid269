package lsystems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class A_XTest {

	@Test
	public void testGetMatch() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBody() {
		@Test
	    public void test1() {
	        char[] expectedVal = {'A', 'A'};
	        A_X a = new A_X();
	        char[] b = a.getBody();
	        char[] value_A_X = {a.getMatch(), b[0]};
	        assert(Arrays.equals(expectedVal, value_A_X));
	}

}
