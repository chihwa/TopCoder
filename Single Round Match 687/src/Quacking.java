import java.util.*;

public class Quacking {

    public final String Q = "quack";

    public int quack(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('q', 0);
        m.put('u', 1);
        m.put('a', 2);
        m.put('c', 3);
        m.put('k', 4);

        List<Character> e = new ArrayList<>();
        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            int idx = m.get(c);
            if (e.contains(c)) {
                e.remove(c);
                e.add(Q.charAt((idx + 1) % 5));
            } else if (c!='q'){
                return -1;
            }  else {
                r++;
                e.remove(c);
                e.add(Q.charAt((idx + 1) % 5));
            }
        }

        if(!e.contains('q')) return -1;
        return r;
    }

}
