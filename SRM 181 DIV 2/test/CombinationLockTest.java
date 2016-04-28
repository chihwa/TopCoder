import org.junit.Test;
import static org.junit.Assert.*;

public class CombinationLockTest {
	
	@Test
	public void test0() {
		int[] combo = new int[] {10,20,30};
		int size = 40;
		int start = 6;
		assertEquals(2556.0, new CombinationLock().degreesTurned(combo, size, start), 1e-9);
	}
	
	@Test
	public void test1() {
		int[] combo = new int[] {0,50,99};
		int size = 100;
		int start = 65;
		assertEquals(2642.4, new CombinationLock().degreesTurned(combo, size, start), 1e-9);
	}
	
	@Test
	public void test2() {
		int[] combo = new int[] {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9};
		int size = 10;
		int start = 5;
		assertEquals(79344.0, new CombinationLock().degreesTurned(combo, size, start), 1e-9);
	}
	
	@Test
	public void test3() {
		int[] combo = new int[] {64,93,87,3,22,53,64,53,11,90,11,59,30,6,11,17,72,0,38,55};
		int size = 97;
		int start = 26;
		assertEquals(79166.59793814432, new CombinationLock().degreesTurned(combo, size, start), 1e-9);
	}
}
