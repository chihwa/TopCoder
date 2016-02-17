import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class BinaryCardinality {

    class Nums implements Comparable<Nums> {
        public int numSetBits;
        public int num;

        public Nums(int numSetBits, int num) {
            this.numSetBits = numSetBits;
            this.num = num;
        }

        @Override
        public int compareTo(Nums o) {
            if (numSetBits != o.numSetBits) return numSetBits - o.numSetBits;
            else return num - o.num;
        }
    }

    public int[] arrange(int[] numbers) {
        List<Nums> l = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            l.add(new Nums(getSetBits(numbers[i]), numbers[i]));
        }
        Collections.sort(l);

        int[] r = new int[numbers.length];
        for (int i = 0; i < l.size(); i++) {
            r[i] = l.get(i).num;
        }

        return r;
    }

    private int getSetBits(int number) {
        int r = 0;
        while (number > 0) {
            if ((number & 1) == 1) {
                r++;
            }
            number = number >> 1;
        }
        return r;
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[10];
        Arrays.sort(nums, (o1, o2) -> (Integer.bitCount(o1) - Integer.bitCount(o2) != 0) ?
                Integer.bitCount(o1) - Integer.bitCount(o2) : o1 - o2);
    }
}
