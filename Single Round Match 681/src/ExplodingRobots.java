import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class ExplodingRobots {
	
	public String canExplode(int x1, int y1, int x2, int y2, String instructions) {

		int lr = 0;
		int ud = 0;
		for (int i = 0; i < instructions.length(); i++) {
			if(instructions.charAt(i)=='L' ||
					instructions.charAt(i)=='R'){
				lr++;
			}else{
				ud++;
			}
		}

		int xd = Math.abs(x1-x2);
		int yd = Math.abs(y1-y2);

		if(xd<=lr && yd<=ud){
			return "Explosion";
		}else{
			return "Safe";
		}

	}
}
