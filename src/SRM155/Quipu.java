package SRM155;

/**
 * Created by Chihwa on 11/18/2015.
 */
public class Quipu {
    public int readKnots(String knots) {
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for (int i = 0; i < knots.length(); i++) {
            if (knots.charAt(i) == 'X') {
                count++;
            } else {
                sb.append((char) ('0' + count));
                count = 0;
            }
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        int r = new Quipu().readKnots("-XX-XXXX-XXX-");
        System.out.println(r);
    }
}
