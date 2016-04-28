import org.junit.Test;
import static org.junit.Assert.*;

public class TeXLeXTest {
	
	@Test
	public void test0() {
		String input = "aAbB cd";
		assertArrayEquals(new int[] { 97,  65,  98,  66,  32,  99,  100 }, new TeXLeX().getTokens(input));
	}
	
	@Test
	public void test1() {
		String input = "^^ ^^5e";
		assertArrayEquals(new int[] { 96,  94 }, new TeXLeX().getTokens(input));
	}
	
	@Test
	public void test2() {
		String input = "^^";
		assertArrayEquals(new int[] { 94,  94 }, new TeXLeX().getTokens(input));
	}
	
	@Test
	public void test3() {
		String input = "^^^5e5e";
		assertArrayEquals(new int[] { 30,  53,  101,  53,  101 }, new TeXLeX().getTokens(input));
	}
	
	@Test
	public void test4() {
		String input = "^^5e^5e^5e^5e^ abASFs&*^@%#";
		assertArrayEquals(new int[] { 96,  97,  98,  65,  83,  70,  115,  38,  42,  94,  64,  37,  35 }, new TeXLeX().getTokens(input));
	}
	
	@Test
	public void test5() {
		String input = "^^5E ^^40";
		assertArrayEquals(new int[] { 117,  69,  32,  64 }, new TeXLeX().getTokens(input));
	}
	
	@Test
	public void test6() {
		String input = "^^`2^^^^OC^^c^^xJ^^Dq9GQpe^^)^^i_&_Q<^^@>|AL8^^d^^";
		assertArrayEquals(new int[] { 32,  50,  30,  94,  79,  67,  35,  56,  74,  4,  113,  57,  71,  81,  112,  101,  105,  41,  95,  38,  95,  81,  60,  0,  62,  124,  65,  76,  56,  36,  94,  94 }, new TeXLeX().getTokens(input));
	}
}
