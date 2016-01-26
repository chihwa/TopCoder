import org.junit.Test;
import static org.junit.Assert.*;

public class IntersectTest {
	
	@Test
	public void test0() {
		int[] x = new int[] {0,2,3,-4};
		int[] y = new int[] {17,1000,18,6};
		assertEquals(2, new Intersect().area(x, y));
	}
	
	@Test
	public void test1() {
		int[] x = new int[] {10000,-10000};
		int[] y = new int[] {-10000,10000};
		assertEquals(400000000, new Intersect().area(x, y));
	}
	
	@Test
	public void test2() {
		int[] x = new int[] {3,8,6,12,10,15};
		int[] y = new int[] {7,17,7,17,7,17};
		assertEquals(0, new Intersect().area(x, y));
	}
	
	@Test
	public void test3() {
		int[] x = new int[] {0,0,0,0,0,0,0,0};
		int[] y = new int[] {5,5,5,5,5,5,5,5};
		assertEquals(0, new Intersect().area(x, y));
	}
	
	@Test
	public void test4() {
		int[] x = new int[] {2,100,5,32,1000,-20,47,12};
		int[] y = new int[] {29,-1000,-800,-200,-900,300,-600,-650};
		assertEquals(1000, new Intersect().area(x, y));
	}
	
	@Test
	public void test5() {
		int[] x = new int[] {1,7,12,3,16,8,3,12}	;
		int[] y = new int[] {-90,-60,-70,3,-60,-90,-80,-100};
		assertEquals(0, new Intersect().area(x, y));
	}
}
