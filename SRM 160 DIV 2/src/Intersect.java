import java.util.Arrays;

public class Intersect {

    public int area(int[] x, int[] y) {
        if (getMinMax(x)) return 0;
        if (getMinMax(y)) return 0;

        Arrays.sort(x);
        Arrays.sort(y);
        int mi = x.length / 2 - 1;
        int xl = x[mi + 1] - x[mi];
        int yl = y[mi + 1] - y[mi];


        return xl * yl;
    }

    private boolean getMinMax(int[] x) {
        int gmin = Math.min(x[0], x[1]);
        int gmax = Math.max(x[0], x[1]);
        for (int i = 2; i < x.length; i += 2) {
            int min = Math.min(x[i], x[i + 1]);
            int max = Math.max(x[i], x[i + 1]);
            if(min > gmin){
                gmin = min;
            }
            if(max < gmax){
                gmax = max;
            }
        }

        if(gmin>=gmax){
            return true;
        }
        return false;
    }
}
