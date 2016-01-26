import org.junit.Test;
import static org.junit.Assert.*;

public class SubstituteTest {
	
	@Test
	public void test0() {
		String key = "TRADINGFEW";
		String code = "LGXWEV";
		assertEquals(709, new Substitute().getValue(key, code));
	}
	
	@Test
	public void test1() {
		String key = "ABCDEFGHIJ";
		String code = "XJ";
		assertEquals(0, new Substitute().getValue(key, code));
	}
	
	@Test
	public void test2() {
		String key = "CRYSTALBUM";
		String code = "MMA";
		assertEquals(6, new Substitute().getValue(key, code));
	}
}
