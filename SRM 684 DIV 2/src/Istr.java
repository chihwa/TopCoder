public class Istr {

    public int count(String s, int k) {
        int a[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < k; i++) {
            int max = -1;
            int maxi = -1;
            for (int j = 0; j < 26; j++) {
                if (a[j] > max) {
                    max = a[j];
                    maxi = j;
                }
            }
            a[maxi]--;
        }
        int r = 0;
        for (int i = 0; i < 26; i++) {
            r += a[i] * a[i];
        }
        return r;
    }
}
