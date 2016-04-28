import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ParenthesesDiv2Easy {
	
	public int getDepth(String s) {
		char in[] = s.toCharArray();
		int r=0;
		int maxr=0;
		for (int i = 0; i < in.length; i++) {
			if(in[i]=='(') r++;
			else r--;
			if(r>maxr) maxr=r;
		}
		return maxr;
	}
}
