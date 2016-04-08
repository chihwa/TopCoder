import org.junit.Test;
import static org.junit.Assert.*;

public class EqualSubstrings2Test {
	
	@Test
	public void test0() {
		String s = "aa";
		assertEquals(1, new EqualSubstrings2().get(s));
	}
	
	@Test
	public void test1() {
		String s = "abcd";
		assertEquals(0, new EqualSubstrings2().get(s));
	}
	
	@Test
	public void test2() {
		String s = "aba";
		assertEquals(1, new EqualSubstrings2().get(s));
	}
	
	@Test
	public void test3() {
		String s = "abab";
		assertEquals(3, new EqualSubstrings2().get(s));
	}
	
	@Test
	public void test4() {
		String s = "aaaab";
		assertEquals(7, new EqualSubstrings2().get(s));
	}
	
	@Test
	public void test5() {
		String s = "onetwothreeonetwothree";
		assertEquals(86, new EqualSubstrings2().get(s));
	}
}
