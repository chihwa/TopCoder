public class ParallelSpeedup {

    public int numProcessors(int k, int overhead) {

        long minTime = Integer.MAX_VALUE;
        long minProcessor = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            long o = getOverHead(i, overhead);
            long t = o + (int) Math.ceil(1.0 * k / i);
            if (t < minTime) {
                minTime = t;
                minProcessor = i;
            }
        }
        return (int) minProcessor;
    }

    private long getOverHead(int i, int overhead) {
        return 1l * overhead * i * (i - 1) / 2;
    }
}
