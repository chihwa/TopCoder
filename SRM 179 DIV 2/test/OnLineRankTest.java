import org.junit.Test;
import static org.junit.Assert.*;

public class OnLineRankTest {
	
	@Test
	public void test0() {
		int k = 3;
		int[] scores = new int[] {6,9,8,15,7,12};
		assertEquals(11, new OnLineRank().calcRanks(k, scores));
	}
	
	@Test
	public void test1() {
		int k = 80;
		int[] scores = new int[] {3,3,3,3,3,3,3};
		assertEquals(7, new OnLineRank().calcRanks(k, scores));
	}
}
