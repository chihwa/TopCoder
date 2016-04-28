import org.junit.Test;
import static org.junit.Assert.*;

public class KiloManTest {
	
	@Test
	public void test0() {
		int[] pattern = new int[] {1,3,2,3,3,1,2,2,1}
;
		String jumps = "JJSSSJSSJ";
		assertEquals(4, new KiloMan().hitsTaken(pattern, jumps));
	}
	
	@Test
	public void test1() {
		int[] pattern = new int[] {1,1,1,1,1,1,1,2,2,2,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,
 4,4,4,5,5,5,5,5,5,5,6,6,6,6,6,6,6,7,7,7,7,7,7,7};
		String jumps = "SSSSSSSSSSSSSSJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ";
		assertEquals(49, new KiloMan().hitsTaken(pattern, jumps));
	}
	
	@Test
	public void test2() {
		int[] pattern = new int[] {1,2,2,1}
;
		String jumps = "SJJS";
		assertEquals(2, new KiloMan().hitsTaken(pattern, jumps));
	}
	
	@Test
	public void test3() {
		int[] pattern = new int[] {1};
		String jumps = "J";
		assertEquals(0, new KiloMan().hitsTaken(pattern, jumps));
	}
}
