import org.junit.Test;
import static org.junit.Assert.*;

public class ClockWalkTest {
	
	@Test
	public void test0() {
		String flips = "hhthh";
		assertEquals(9, new ClockWalk().finalPosition(flips));
	}
	
	@Test
	public void test1() {
		String flips = "hhtht";
		assertEquals(11, new ClockWalk().finalPosition(flips));
	}
	
	@Test
	public void test2() {
		String flips = "hthth";
		assertEquals(3, new ClockWalk().finalPosition(flips));
	}
	
	@Test
	public void test3() {
		String flips = "hthhhhh";
		assertEquals(12, new ClockWalk().finalPosition(flips));
	}
	
	@Test
	public void test4() {
		String flips = "hthhthtththhtttthttthhhthtttthh";
		assertEquals(6, new ClockWalk().finalPosition(flips));
	}
}
