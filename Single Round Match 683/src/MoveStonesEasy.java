import java.util.*;
import java.math.*;
import java.util.stream.IntStream;

import static java.lang.Math.*;

public class MoveStonesEasy {
	
	public int get(int[] a, int[] b) {
		int suma = IntStream.of(a).sum();
		int sumb = IntStream.of(b).sum();
		if(suma!=sumb){
			return -1;
		}

		int diff[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			diff[i] = b[i] - a[i];
		}

		int sum = diff[0];
		int r =0;
		for (int i = 1; i < a.length; i++) {
			sum += diff[i];
			if(sum==0){
				r += i;
			}
		}

		return r;
	}
}
