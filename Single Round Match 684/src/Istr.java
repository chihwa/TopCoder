import java.util.Arrays;

public class Istr {

    public int count(String s, int k) {
        int m[] = new int[26];
        for (int i = 0; i < m.length; i++) {
            m[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            m[idx] = m[idx] + 1;
        }

        for (int i = 0; i < k; i++) {
            Arrays.sort(m);
            int max = m[m.length-1];
            m[m.length-1] = max -1;
        }

        int r = 0;
        for (int i = 0; i < m.length; i++) {
            r += m[i] * m[i];
        }

        return r;
    }
}
