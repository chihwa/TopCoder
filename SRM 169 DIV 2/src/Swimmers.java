public class Swimmers {

    public int[] getSwimTimes(int[] distances, int[] speeds, int current) {
        int r[] = new int[distances.length];
        for (int i = 0; i < distances.length; i++) {
            int d = distances[i];
            int s = speeds[i];
            if (d != 0 && s <= current) {
                r[i] = -1;
                continue;
            } else {
                r[i] = (int) (Math.floor((double) d / (s + current) + (double) d / (s - current)));
            }
        }
        return r;
    }
}
