import org.junit.Test;
import static org.junit.Assert.*;

public class PackhorsesTest {
	
	@Test
	public void test0() {
		int p = 1;
		int x = 5;
		int y = 0;
		assertEquals(2, new Packhorses().horses(p, x, y));
	}
	
	@Test
	public void test1() {
		int p = 1;
		int x = 6;
		int y = 0;
		assertEquals(3, new Packhorses().horses(p, x, y));
	}
	
	@Test
	public void test2() {
		int p = 20;
		int x = 15;
		int y = 7;
		assertEquals(20, new Packhorses().horses(p, x, y));
	}
	
	@Test
	public void test3() {
		int p = 1;
		int x = 3;
		int y = 1;
		assertEquals(2, new Packhorses().horses(p, x, y));
	}
}
