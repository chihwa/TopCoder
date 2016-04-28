import org.junit.Test;
import static org.junit.Assert.*;

public class ParenthesesDiv2EasyTest {
	
	@Test
	public void test0() {
		String s = "(())";
		assertEquals(2, new ParenthesesDiv2Easy().getDepth(s));
	}
	
	@Test
	public void test1() {
		String s = "()()()";
		assertEquals(1, new ParenthesesDiv2Easy().getDepth(s));
	}
	
	@Test
	public void test2() {
		String s = "(())()";
		assertEquals(2, new ParenthesesDiv2Easy().getDepth(s));
	}
	
	@Test
	public void test3() {
		String s = "((())())(((())(()))())";
		assertEquals(4, new ParenthesesDiv2Easy().getDepth(s));
	}
	
	@Test
	public void test4() {
		String s = "()";
		assertEquals(1, new ParenthesesDiv2Easy().getDepth(s));
	}
}
