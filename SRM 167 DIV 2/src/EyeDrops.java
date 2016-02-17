public class EyeDrops {

    public double closest(int sleepTime, int k) {
        double interval = 24d * 60 / k;
        if (sleepTime * 60 < interval) {
            return interval;
        } else {
            return 60d * (24.0 - sleepTime) / (k - 1);
        }
    }
}
