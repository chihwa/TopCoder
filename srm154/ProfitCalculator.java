package srm154;

/**
 * Created by Chihwa on 11/18/2015.
 */
public class ProfitCalculator {
    public int percent(String[] items) {

        double cost = 0d;
        double price = 0d;

        for (String line : items) {
            String[] prices = line.split(" ");
            price += Double.parseDouble(prices[0]);
            cost += Double.parseDouble(prices[1]);
        }

        return (int) ((price - cost) * 100 / price);
    }

    public static void main(String[] args) {
        int r = new ProfitCalculator().percent(new String[]{"012.99 008.73", "099.99 050.00", "123.45 101.07"});
        System.out.println(r);
    }
}
