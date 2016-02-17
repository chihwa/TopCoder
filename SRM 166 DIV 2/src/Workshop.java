import java.util.HashSet;
import java.util.Set;

public class Workshop {

    public int pictureFrames(int[] pieces) {
        int len = pieces.length;
        int r = 0;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (canFormTriangle(pieces[i], pieces[j], pieces[k])) {
                        r++;
                    }
                }
            }
        }
        return r;
    }

    private boolean canFormTriangle(int i, int j, int k) {
        int longest = Math.max(i, Math.max(j, k));
        int rest = i + j + k - longest;
        return longest < rest;
    }
}
