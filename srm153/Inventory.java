package srm153;

/**
 * Created by Chihwa on 11/18/2015.
 */
public class Inventory {
    public int monthlyOrder(int[] sales, int[] daysAvailable) {

        double itemCount = 0;
        double itemTotal = 0;
        for (int i = 0; i < sales.length; i++) {
            if (daysAvailable[i] == 0) {
                continue;
            }
            itemTotal += sales[i] * 30 / (double) daysAvailable[i];
            itemCount++;
        }

        double ret = itemTotal / itemCount;
        int r = (int) ret;
        if(Math.abs(r-ret)< 1e-10){
            return r;
        }

        return r+1;
    }

    public static void main(String[] args) {
        int r = new Inventory().monthlyOrder(new int[]{1115, 7264, 3206, 6868, 7301}, new int[]{1, 3, 9, 4, 18});
        System.out.println(r);
    }
}
