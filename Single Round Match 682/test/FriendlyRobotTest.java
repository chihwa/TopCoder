import org.junit.Test;
import static org.junit.Assert.*;

public class FriendlyRobotTest {
	
	@Test
	public void test0() {
		String instructions = "UULRRLLL";
		int changesAllowed = 1;
		assertEquals(3, new FriendlyRobot().findMaximumReturns(instructions, changesAllowed));
	}
	
	@Test
	public void test1() {
		String instructions = "ULDR";
		int changesAllowed = 0;
		assertEquals(1, new FriendlyRobot().findMaximumReturns(instructions, changesAllowed));
	}
	
	@Test
	public void test2() {
		String instructions = "ULDR";
		int changesAllowed = 2;
		assertEquals(2, new FriendlyRobot().findMaximumReturns(instructions, changesAllowed));
	}
	
	@Test
	public void test3() {
		String instructions = "ULDRRLRUDUDLURLUDRUDL";
		int changesAllowed = 4;
		assertEquals(8, new FriendlyRobot().findMaximumReturns(instructions, changesAllowed));
	}
	
	@Test
	public void test4() {
		String instructions = "LRLDRURDRDUDDDDRLLRUUDURURDRRDRULRDLLDDDDRLRRLLRRDDLRURLRULLLLLRRRDULRULULRLRDLLDDLLRDLUUDUURRULUDUDURULULLDRUDUUURRRURUULRLDLRRRDLLDLRDUULUURUDRURRLURLDLDDUUURRURRLRDLDDULLUDLUDULRDLDUURLUUUURRLRURRDLRRLLLRDRDUUUDRRRDLDRRUUDUDDUDDRLUDDULRURRDRUDLDLLLDLUDDRLURLDUDRUDDDDURLUUUDRLURDDDDLDDRDLUDDLDLURR";
		int changesAllowed = 47;
		assertEquals(94, new FriendlyRobot().findMaximumReturns(instructions, changesAllowed));
	}
	
	@Test
	public void test5() {
		String instructions = "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU";
		int changesAllowed = 300;
		assertEquals(150, new FriendlyRobot().findMaximumReturns(instructions, changesAllowed));
	}
	
	@Test
	public void test6() {
		String instructions = "UD";
		int changesAllowed = 1;
		assertEquals(1, new FriendlyRobot().findMaximumReturns(instructions, changesAllowed));
	}
}
