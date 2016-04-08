import org.junit.Test;
import static org.junit.Assert.*;

public class LCMRangeTest {
	
	@Test
	public void test0() {
		int first = 1;
		int last = 5;
		assertEquals(60, new LCMRange().lcm(first, last));
	}
	
	@Test
	public void test1() {
		int first = 4;
		int last = 5;
		assertEquals(20, new LCMRange().lcm(first, last));
	}
	
	@Test
	public void test2() {
		int first = 1;
		int last = 12;
		assertEquals(27720, new LCMRange().lcm(first, last));
	}
}
