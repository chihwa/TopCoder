package SRM152;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chihwa on 10/30/2015.
 */
public class LeaguePicks {
    public int[] returnPicks(int position, int friends, int picks) {
        int i = 1;
        boolean dir = true;
        List<Integer> r = new ArrayList<>();
        for (int j = 1; j <= picks; j++) {
            if (i == position) {
                r.add(j);
            }
            if (dir) {
                if (i < friends) {
                    i++;
                } else {
                    dir = !dir;
                }
            } else {
                if (i > 1) {
                    i--;
                } else {
                    dir = !dir;
                }
            }
        }

        int ra[] = new int[r.size()];
        for (int j = 0; j < r.size(); j++) {
            ra[j] = r.get(j);
        }

        return ra;
    }

    public static void main(String[] args) {
        int r[] = new LeaguePicks().returnPicks(3, 6, 15);
        System.out.println(Arrays.toString(r));
    }
}
