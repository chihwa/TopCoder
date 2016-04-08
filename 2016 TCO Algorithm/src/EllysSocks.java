import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class EllysSocks {

    public int getDifference(int[] S, int P) {
        Arrays.sort(S);

        int diffs1[] = new int[S.length / 2];
        int diffs2[] = new int[S.length / 2];

        for (int i = 0; i < S.length; i += 2) {
            diffs1[i / 2] = S[i + 1] - S[i];
        }
        Arrays.sort(diffs1);
        System.out.println(Arrays.toString(diffs1));


        for (int i = 0; i < S.length - 2; i += 2) {
            diffs2[i/2] = S[i + 2] - S[i + 1];
        }
        diffs2[diffs2.length - 1] = S[S.length - 1] - S[0];
        Arrays.sort(diffs2);
        System.out.println(Arrays.toString(diffs2));

        return Math.min(diffs1[P - 1], diffs2[P -1]);
    }
}
