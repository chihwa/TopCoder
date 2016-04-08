import org.junit.Test;
import static org.junit.Assert.*;

public class StairClimbTest {
	
	@Test
	public void test0() {
		int[] flights = new int[] {15};
		int stairsPerStride = 2;
		assertEquals(8, new StairClimb().stridesTaken(flights, stairsPerStride));
	}
	
	@Test
	public void test1() {
		int[] flights = new int[] {15,15};
		int stairsPerStride = 2;
		assertEquals(18, new StairClimb().stridesTaken(flights, stairsPerStride));
	}
	
	@Test
	public void test2() {
		int[] flights = new int[] {5,11,9,13,8,30,14};
		int stairsPerStride = 3;
		assertEquals(44, new StairClimb().stridesTaken(flights, stairsPerStride));
	}
}
