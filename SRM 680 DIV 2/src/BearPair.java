import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class BearPair {
	
	public int bigDistance(String s) {
		char[] aa = s.toCharArray();
		int max = -1;
		for (int i = 0; i < aa.length; i++) {
			for (int j = i; j < aa.length; j++) {
				if(aa[i]!=aa[j]){
					if(j-i>max){
						max = j-i;
					}
				}
			}
		}
		return max;
	}
}
