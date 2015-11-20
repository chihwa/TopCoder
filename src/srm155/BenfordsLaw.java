package srm155;

/**
 * Created by Chihwa on 11/19/2015.
 */
public class BenfordsLaw {
    public int questionableDigit(int[] transactions, int threshold) {
        int freq[] = new int[9];
        for (int i = 0; i < transactions.length; i++) {
            int cur = transactions[i];
            int firstDigit = Integer.parseInt(String.valueOf(String.valueOf(cur).charAt(0)));
            freq[firstDigit - 1]++;
        }

        double expected[] = new double[9];
        for (int i = 0; i < 9; i++) {
            expected[i] = Math.log10(1 + 1.0 / (i + 1)) * transactions.length;
        }

        for (int i = 0; i < 9; i++) {
            if ((freq[i] < expected[i] / (double) threshold) ||
                    (freq[i] > expected[i] * (double) threshold)) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int r = new BenfordsLaw().questionableDigit(new int[]{1, 10, 100, 2, 20, 200, 2000, 3, 30, 300}, 2);
        System.out.println(r);
    }
}
