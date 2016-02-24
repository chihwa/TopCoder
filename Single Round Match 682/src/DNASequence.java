import java.util.*;
import java.math.*;
import java.util.stream.Collector;

import static java.lang.Math.*;

public class DNASequence {
	
	public int longestDNASequence(String sequence) {

		Set<Character> set = new HashSet<>();
		set.add('A');
		set.add('C');
		set.add('G');
		set.add('T');

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < sequence.length(); i++) {
			for (int j = i; j < sequence.length()+1; j++) {
				String ss = sequence.substring(i, j);
				int k=0;
				for (; k < ss.length(); k++) {
					if(!set.contains(ss.charAt(k))){
						break;
					}
				}
				if(k==ss.length() && k > max){
					max = k;
				}

			}
		}
		return max;
	}
}
