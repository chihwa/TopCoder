package srm152;

/**
 * Created by Chihwa on 10/29/2015.
 */
public class FixedPointTheorem {

    public double cycleRange(double R) {
        double X = 0.25;

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (int i = 1; i <= 201000; i++) {
            X = R * X * (1 - X);
            if (i > 200000) {
                if (X < min) {
                    min = X;
                } else if (X > max) {
                    max = X;
                }
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        double r = new FixedPointTheorem().cycleRange(3.05);
        System.out.println(r);
    }
}
