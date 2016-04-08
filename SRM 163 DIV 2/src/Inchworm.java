import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Inchworm {
	
	public int lunchtime(int branch, int rest, int leaf) {
		int b[] = new int[branch+1];
		for (int i = 0; i <= branch; i+=leaf) {
			b[i] = 1;
		}
		int r=0;
		for (int i = 0; i <= branch; i+=rest) {
			if(b[i]==1){
				r++;
			}
		}
		return r;
	}
}
