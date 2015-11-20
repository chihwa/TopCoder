package SRM673;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chihwa on 11/18/2015.
 */
public class BearSong {

    public int countRareNotes(int[] n) {
        Map<Integer, Boolean> s = new HashMap<>();
        for (int e : n) {
            if (s.containsKey(e)) {
                s.put(e, Boolean.FALSE);
            } else {
                s.put(e, Boolean.TRUE);
            }
        }

        int r = 0;
        for (int key : s.keySet()) {
            if (s.get(key)) {
                r++;
            }
        }

        return r;
    }
}
