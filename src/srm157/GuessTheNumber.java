package srm157;

/**
 * Created by Chihwa on 11/19/2015.
 */
public class GuessTheNumber {
    public int noGuesses(int upper, int answer) {
        int lower = 1;
        int r = 0;
        while (lower <= upper) {
            int guess = lower + (upper - lower) / 2;
            r++;
            if (guess == answer) {
                return r;
            }

            if (guess > answer) {
                upper = guess - 1;
            } else {
                lower = guess + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int r = new GuessTheNumber().noGuesses(9, 6);
        System.out.println(r);
    }
}
