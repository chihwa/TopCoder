import java.util.*;
import java.math.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.*;

public class NonDeterministicSubstring {
	
	public long ways(String A, String B) {
		int al = A.length();
		int bl = B.length();
		B=B.replaceAll("\\?", ".");
		Pattern p = Pattern.compile(B);
		int r = 0;
		Set<String> set = new HashSet<>();
		for (int start = 0; start <= al - bl; start++) {
			String subString = A.substring(start, start+bl);
			Matcher m = p.matcher(subString);
			if(m.matches() && !set.contains(subString)){
				r++;
				set.add(subString);
			}
		}
		return r;
	}
}
