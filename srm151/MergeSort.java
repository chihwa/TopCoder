package srm151;

/**
 * Created by Chihwa on 10/29/2015.
 */
public class MergeSort {
    int c = 0;

    public int howManyComparisons(int[] numbers) {
        mergeSort(numbers, 0, numbers.length - 1);
        return c;
    }


    public void mergeSort(int[] n, int s, int e) {
        if (s < e) {
            int m = s + (e - s) / 2;
            mergeSort(n, s, m);
            mergeSort(n, m + 1, e);
            merge(n, s, m, e);
        }
    }

    private void merge(int[] n, int s, int m, int e) {
        int t[] = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            t[i] = n[i];
        }

        int ls = s;
        int le = m;
        int rs = m + 1;
        int re = e;
        int wi = s;
        while (ls <= le && rs <= re) {
            if (t[ls] < t[rs]) {
                n[wi++] = t[ls++];
            } else {
                n[wi++] = t[rs++];
            }
            c++;
        }

        while (ls <= le) {
            n[wi++] = t[ls++];
        }
    }

    public static void main(String[] args) {
        int r = new MergeSort().howManyComparisons(new int[]{-2000000000, 2000000000, 0, 0, 0, -2000000000, 2000000000, 0, 0, 0});
        System.out.println(r);
    }
}
