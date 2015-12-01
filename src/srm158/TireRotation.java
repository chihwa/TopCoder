package srm158;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chihwa on 11/20/2015.
 */
public class TireRotation {
    public int getCycle(String initial, String current) {
        Map<String, Integer> m = new HashMap<>();
        char a = initial.charAt(0);
        char b = initial.charAt(1);
        char c = initial.charAt(2);
        char d = initial.charAt(3);

        m.put(String.valueOf(new char[]{a, b, c, d}), 1);
        m.put(String.valueOf(new char[]{d, c, a, b}), 2);
        m.put(String.valueOf(new char[]{b, a, d, c}), 3);
        m.put(String.valueOf(new char[]{c, d, b, a}), 4);

        if (m.containsKey(current)) {
            return m.get(current);
        } else {
            return -1;
        }
    }
}
