package srm150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chihwa on 10/28/2015.
 */
public class InterestingDigits {

    public int[] digits(int b) {
        List<Integer> r = new ArrayList<>();
        for (int i = 2; i < b; i++) {
            if (intresting(i, b)) {
                r.add(i);
            }
        }

        int a[] = new int[r.size()];
        for (int i = 0; i < r.size(); i++) {
            a[i] = r.get(i);
        }

        return a;

    }

    private boolean intresting(int d, int b) {
        for (int i = 0; i < b * b * b; i += d) {
            int sum = 0, n = i;
            while (n > 0) {
                sum += n % b;
                n = n / b;
            }
            if (sum % d != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int r[] = new InterestingDigits().digits(10);
        System.out.println(Arrays.toString(r));
    }
}
