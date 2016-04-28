public class OnLineRank {

    public int calcRanks(int k, int[] scores) {
        int ret = 0;
        for (int i = 0; i < scores.length; i++) {
            ret++;
            for (int j = Math.max(0, i - k); j < i; j++) {
                if (scores[j] > scores[i]) ret++;
            }
        }
        return ret;
    }
}
