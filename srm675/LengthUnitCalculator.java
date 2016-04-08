package srm675;

import java.util.Arrays;

/**
 * Created by Chihwa on 12/10/2015.
 */
public class LengthUnitCalculator {
    public double calc(int amount, String fromUnit, String toUnit) {
        String units[] = {"mi", "yd", "ft", "in"};
        double conv[] = {1760, 3, 12};

        double r = amount;

        int fromIdx = Arrays.asList(units).indexOf(fromUnit);
        int toIdx = Arrays.asList(units).indexOf(toUnit);

        if (fromIdx == toIdx) {
            return r;
        } else if (fromIdx < toIdx) {
            for (int i = fromIdx; i < toIdx; i++) {
                r *= conv[i];
            }
        } else {
            for (int i = fromIdx - 1; i >= toIdx; i--) {
                r /= conv[i];
            }
        }

        return r;
    }

    public static void main(String[] args) {
        double r = new LengthUnitCalculator().calc(1, "ft", "ft");
        System.out.println(r);
    }
}
