import java.util.*;
import java.math.*;
import java.util.stream.IntStream;

import static java.lang.Math.*;

public class BritishCoins {
	
	public int[] coins(int pence) {
		int pound = pence / 240;
		pence = pence %240;
		int shilling = pence /12;
		pence = pence % 12;
		return IntStream.of(pound, shilling, pence).toArray();
	}
}
