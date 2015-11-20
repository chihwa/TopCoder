package srm157;

/**
 * Created by Chihwa on 11/19/2015.
 */
public class Salary {
    public int howMuch(String[] arrival, String[] departure, int wage) {
        long es1 = 0;
        long ee1 = 6 * 3600;

        long es2 = 18 * 3600;
        long ee2 = 24 * 3600;

        double r = 0;
        for (int i = 0; i < arrival.length; i++) {
            int a = getTime(arrival[i]);
            int d = getTime(departure[i]);

            double val = 0;
            if (es1 <= a && a < ee1) {
                if (d <= ee1) {
                    val = (d - a) * 1.5;
                } else if (d <= es2) {
                    val = (ee1 - a) * 1.5 + (d - ee1);
                } else {
                    val = (ee1 - a) * 1.5 + (es2 - ee1) + (d - es2) * 1.5;
                }
            } else if (ee1 <= a && a < es2) {
                if (d <= es2) {
                    val = (d - a);
                } else {
                    val = (es2 - a) + (d - es2) * 1.5;
                }
            } else {
                val = (d - a) * 1.5;
            }

            r += val * wage / 3600.0;
        }

        return (int) r;
    }

    private int getTime(String input) {
        String e[] = input.split(":");
        int h = Integer.parseInt(e[0]) * 3600;
        int m = Integer.parseInt(e[1]) * 60;
        int s = Integer.parseInt(e[2]);

        return h + m + s;
    }

    public static void main(String[] args) {
        int r = new Salary().howMuch(
                new String[]{"08:00:00", "13:00:00", "19:27:32"},
                new String[]{"12:00:00", "17:00:00", "20:48:10"},
                1000);
        System.out.println(r);
    }
}
