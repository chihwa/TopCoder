import java.util.HashMap;
import java.util.Map;

public class Substitute {

    public int getValue(String key, String code) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            m.put(key.charAt(i), (i + 1) % 10);
        }

        String r = "";
        for(char c: code.toCharArray()){
            if(m.containsKey(c)){
                r += m.get(c);
            }
        }
        return Integer.parseInt(r);
    }
}
