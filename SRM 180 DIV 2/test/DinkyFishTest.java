import org.junit.Test;
import static org.junit.Assert.*;

public class DinkyFishTest {
	
	@Test
	public void test0() {
		int tankVolume = 10;
		int maleNum = 4;
		int femaleNum = 6;
		assertEquals(2, new DinkyFish().monthsUntilCrowded(tankVolume, maleNum, femaleNum));
	}
	
	@Test
	public void test1() {
		int tankVolume = 100;
		int maleNum = 4;
		int femaleNum = 6;
		assertEquals(5, new DinkyFish().monthsUntilCrowded(tankVolume, maleNum, femaleNum));
	}
	
	@Test
	public void test2() {
		int tankVolume = 5;
		int maleNum = 6;
		int femaleNum = 4;
		assertEquals(1, new DinkyFish().monthsUntilCrowded(tankVolume, maleNum, femaleNum));
	}
	
	@Test
	public void test3() {
		int tankVolume = 4;
		int maleNum = 6;
		int femaleNum = 4;
		assertEquals(0, new DinkyFish().monthsUntilCrowded(tankVolume, maleNum, femaleNum));
	}
	
	@Test
	public void test4() {
		int tankVolume = 1000000;
		int maleNum = 3;
		int femaleNum = 2;
		assertEquals(19, new DinkyFish().monthsUntilCrowded(tankVolume, maleNum, femaleNum));
	}
	
	@Test
	public void test5() {
		int tankVolume = 431131;
		int maleNum = 764;
		int femaleNum = 249;
		assertEquals(11, new DinkyFish().monthsUntilCrowded(tankVolume, maleNum, femaleNum));
	}
}
