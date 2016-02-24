import org.junit.Test;
import static org.junit.Assert.*;

public class TopBiologistTest {
	
	@Test
	public void test0() {
		String sequence = "ACTGACATAGCTCGTGCATAGATCGCGTCCTTGG";
		assertEquals("AC", new TopBiologist().findShortestNewSequence(sequence));
	}
	
	@Test
	public void test1() {
		String sequence = "AGACGACGGAGAACGA";
		assertEquals("T", new TopBiologist().findShortestNewSequence(sequence));
	}
	
	@Test
	public void test2() {
		String sequence = "A";
		assertEquals("C", new TopBiologist().findShortestNewSequence(sequence));
	}
	
	@Test
	public void test3() {
		String sequence = "AAGATACACCGGCTTCGTG";
		assertEquals("CAT", new TopBiologist().findShortestNewSequence(sequence));
	}
}
