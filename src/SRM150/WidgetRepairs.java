package SRM150;

/**
 * Created by Chihwa on 10/28/2015.
 */
public class WidgetRepairs {
    public int days(int[] arrivals, int numPerDay) {
        int sum = 0;
        int day = 0;
        for (int i = 0; i < arrivals.length; i++) {
            sum += arrivals[i];
            if (sum > 0) {
                day++;
                sum -= numPerDay;
                if (sum < 0) {
                    sum = 0;
                }
            }
        }

        if (sum > 0) {
            if (sum % numPerDay == 0) {
                day += sum / numPerDay;
            } else {
                day += sum / numPerDay + 1;
            }
        }

        return day;
    }

}
