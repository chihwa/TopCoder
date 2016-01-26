package srm676;

/**
 * Created by Chihwa on 12/18/2015.
 */
public class FarmvilleDiv2 {
    public int minTime(int[] time, int[] cost, int budget) {
        while (budget > 0) {

            int minCost = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int i = 0; i < time.length; i++) {
                if (time[i] > 0) {
                    if (cost[i] < minCost) {
                        minCost = cost[i];
                        minIdx = i;
                    }
                }
            }

            if(minIdx == -1){
                break;
            }

            if (budget >= time[minIdx] * cost[minIdx]) {
                budget -= time[minIdx] * cost[minIdx] ;
                time[minIdx] = 0;
            }else if(budget<cost[minIdx]){
                break;
            }else{
                time[minIdx] -= (int)(budget/cost[minIdx]);
                budget = budget % (int)(budget/cost[minIdx]);
            }

        }

        int sum=0;
        for (int i = 0; i < time.length; i++) {
            sum += time[i];
        }

        return sum;

    }


    public static void main(String[] args) {
        int r = new FarmvilleDiv2().minTime(new int[]{100}, new int[]{1}, 101);
        System.out.println(r);
    }
}
