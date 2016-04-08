import com.sun.org.apache.xml.internal.utils.StringComparable;

import java.util.*;

public class TopBiologist {

    public String findShortestNewSequence(String sequence) {
        Set<String> set = new HashSet<>();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sequence.length(); i++) {
            for (int j = i; j < sequence.length() + 1; j++) {
                String ss = sequence.substring(i, j);
                set.add(ss);
            }
        }

        //get all sequence
        String acgt = "ACGT";
        List<String> l = new ArrayList<>();
        for (int i = 0; i < acgt.length(); i++) {
            for (int j = i + 1; j < acgt.length() + 1; j++) {
                String ss = acgt.substring(i, j);
                l.add(ss);
            }
        }

        Collections.sort(l, new StrComprator());

        for (String s: l){
            if(!set.contains(s)){
                return s;
            }
        }

        return null;
    }

    class StrComprator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            if (o1.length()!=o2.length()){
                return o1.length()-o2.length();
            }else {

                return o1.compareTo(o2);
            }
        }
    }

}
