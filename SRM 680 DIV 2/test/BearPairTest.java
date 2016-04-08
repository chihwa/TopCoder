import org.junit.Test;
import static org.junit.Assert.*;

public class BearPairTest {
	
	@Test
	public void test0() {
		String s = "bear";
		assertEquals(3, new BearPair().bigDistance(s));
	}
	
	@Test
	public void test1() {
		String s = "abcba";
		assertEquals(3, new BearPair().bigDistance(s));
	}
	
	@Test
	public void test2() {
		String s = "oooohyeahpotato";
		assertEquals(13, new BearPair().bigDistance(s));
	}
	
	@Test
	public void test3() {
		String s = "zzzzzzzzzzzzzzzzzzzzz";
		assertEquals(-1, new BearPair().bigDistance(s));
	}
	
	@Test
	public void test4() {
		String s = "qw";
		assertEquals(1, new BearPair().bigDistance(s));
	}
	
	@Test
	public void test5() {
		String s = "xxyyxyxyyyyyyxxxyxyxxxyxyxyyyyyxxxxxxyyyyyyyyxxxxx";
		assertEquals(47, new BearPair().bigDistance(s));
	}
}
