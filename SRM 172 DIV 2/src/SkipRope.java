import java.util.Arrays;

public class SkipRope {

    public int[] partners(int[] candidates, int height) {
        Arrays.sort(candidates);
        int i = 0;
        for (; i < candidates.length; i++) {
            if (candidates[i] > height) {
                break;
            }
        }

        if (i == candidates.length) {
            return new int[]{candidates[i - 2], candidates[i - 1]};
        } else if (i == 0) {
            return new int[]{candidates[i], candidates[i+1]};
        } else {
            return new int[]{candidates[i - 1], candidates[i]};
        }
    }
}
