public class DivFreed2 {

    public int checkArray(int a[], int curIdx, int k) {
        if (curIdx == a.length) {
//            System.err.println(Arrays.toString(a));
            if (valid(a)) {
                return 1;
            } else {
                return 0;
            }
        }


        int sum = 0;
        for (int i = 1; i <= k; i++) {
            if (curIdx > 0 && a[curIdx - 1] > i && a[curIdx - 1] % i == 0){
                continue;
            }

            a[curIdx] = i;
            sum += checkArray(a, curIdx + 1, k);
        }

        return sum;

    }

    private boolean valid(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1] && a[i + 1] != 0 && a[i] % a[i + 1] == 0) {
                return false;
            }
        }
        return true;
    }

    public int count(int n, int k) {
        int a[] = new int[n];

        return checkArray(a, 0, k);
    }
}
