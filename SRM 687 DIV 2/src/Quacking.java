public class Quacking {

    public int quack(String s) {
        char[] sa = s.toCharArray();
        int[] a = new int[5];
        int maxr = 0;
        int r = 0;
        for (int i = 0; i < sa.length; i++) {
            char c = sa[i];
            switch (c) {
                case 'q':
                    r++;
                    a[0]++;
                    break;
                case 'u':
                    a[1]++;
                    if (a[0] < a[1]) return -1;
                    break;
                case 'a':
                    a[2]++;
                    if (a[1] < a[2]) return -1;
                    break;
                case 'c':
                    a[3]++;
                    if (a[2] < a[3]) return -1;
                    break;
                case 'k':
                    r--;
                    a[4]++;
                    if (a[3] < a[4]) return -1;
                    break;
            }
            maxr = Math.max(r, maxr);
        }

        int i = 1;
        for (; i < 5; i++) {
            if (a[i - 1] != a[i]) break;
        }
        return (i == 5) ? maxr : -1;
    }
}
