package SRM673;

/**
 * Created by Chihwa on 11/18/2015.
 */
public class BearSlowlySorts {
    public int minMoves(int[] w) {
        int min = w[0];
        int max = w[0];
        int mini = 0;
        int maxi = 0;
        for (int i = 1; i < w.length; i++) {
            if (w[i] < min) {
                min = w[i];
                mini = i;
            } else if (w[i] > max) {
                max = w[i];
                maxi = i;
            }
        }

        if (isSorted(w)) {
            return 0;
        } else if (maxi == 0 && mini == w.length - 1) {
            return 3;
        } else if (mini == 0 || maxi == w.length - 1) {
            return 1;
        } else {
            return 2;
        }
    }

    private boolean isSorted(int[] w) {
        for (int i = 0; i < w.length - 1; i++) {
            if (w[i] > w[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int r = new BearSlowlySorts().minMoves(new int[]{5, 2, 3, 4, 1});
        System.out.println(r);
    }
}
