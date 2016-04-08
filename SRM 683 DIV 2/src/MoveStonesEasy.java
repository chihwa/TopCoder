import java.util.stream.IntStream;

public class MoveStonesEasy {

    public int get(int[] a, int[] b) {
        int n = a.length;
        if(IntStream.of(a).sum() != IntStream.of(b).sum()){
            return -1;
        }
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            int d = b[i] - a[i];
            a[i + 1] -= d;
            r += Math.abs(d);
        }
        return r;
    }
}
