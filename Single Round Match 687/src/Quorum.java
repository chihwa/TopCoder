import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Quorum {
	
	public int count(int[] arr, int k) {
		Arrays.sort(arr);
		int r = 0;
		for (int i = 0; i < k; i++) {
			r+=arr[i];
		}
		return r;
	}
}
