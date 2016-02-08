import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BearChairs {

    public int[] findPositions(int[] atLeast, int d) {
        int n = atLeast.length;
        int r[] = new int[n];
        List<Integer> l = new ArrayList<>();
        l.add(2 * 1000 * 1000 * 1000);
        for (int i = 0; i < n; i++) {
            int where = 0;
            if (atLeast[i] <= l.get(0) - d) {
                where = atLeast[i];
            } else {
                for (int j = 0; ; j++) {
                    where = Math.max(atLeast[i], l.get(j) + d);
                    if (where <= l.get(j + 1) - d) {
                        break;
                    }
                }
            }
            r[i] = where;
            l.add(where);
            Collections.sort(l);
        }
        return r;
    }
}
