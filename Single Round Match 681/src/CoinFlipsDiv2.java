import java.util.*;
import java.math.*;
import java.util.stream.IntStream;

import static java.lang.Math.*;

public class CoinFlipsDiv2 {
	
	public int countCoins(String state) {
		int l[] = new int[state.length()];
		for (int i = 0; i < state.length()-1; i++) {
			if(state.charAt(i)!=state.charAt(i+1)){
				l[i]=1;
				l[i+1]=1;
			}
		}

		return IntStream.of(l).sum();
	}
}
