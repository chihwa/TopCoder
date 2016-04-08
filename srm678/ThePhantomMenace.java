package srm678;

/**
 * Created by Chihwa on 1/12/2016.
 */
public class ThePhantomMenace {
    public int find(int[] doors, int[] droids){
        int max_sl = Integer.MIN_VALUE;

        for (int i = 0; i < doors.length; i++) {
            int min_sl = Integer.MAX_VALUE;
            for (int j = 0; j < droids.length; j++) {
                int sl = Math.abs(droids[j] - doors[i]);
                if (sl < min_sl){
                    min_sl = sl;
                }
            }
            if(min_sl > max_sl){
                max_sl = min_sl;
            }
        }

        return max_sl;
    }

    public static void main(String[] args) {
        int r = new ThePhantomMenace().find(new int[]{2,3,5,7,11}, new int[]{1,8,13});
        System.out.println(r);
    }
}
