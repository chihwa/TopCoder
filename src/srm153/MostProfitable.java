package srm153;

/**
 * Created by Chihwa on 11/18/2015.
 */
public class MostProfitable {
    public String bestItem(int[] costs, int[] prices, int[] sales, String[] items) {
        int maxProfit = (prices[0] - costs[0]) * sales[0];
        int maxIndex = 0;
        for (int i = 1; i < costs.length; i++) {
            int p = (prices[i] - costs[i]) * sales[i];
            if (p > maxProfit) {
                maxIndex = i;
                maxProfit = p;
            }
        }

        if (maxProfit <= 0) {
            return "";
        }
        return items[maxIndex];
    }

}
