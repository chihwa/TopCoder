public class TeXLeX {
    boolean ddd = false;

    public int[] getTokens(String input) {
        int i, j, k;
        String s = input + (char) 0 + (char) 0 + (char) 0 + (char) 0;
        String r = "";
        while (s.length() > 0) {
            if (s.startsWith("^^")) {
                char c1 = s.charAt(2);
                char c2 = s.charAt(3);
                if ((('0' <= c1 && c1 <= '9') || ('a' <= c1 && c1 <= 'f')) &&
                        (('0' <= c2 && c2 <= '9') || ('a' <= c2 && c2 <= 'f'))) {
                    s = "" + (char) (Integer.parseInt(s.substring(2, 4), 16)) + s.substring(4);
                } else if (c1 > 63) {
                    s = "" + (char) (c1 - 64) + s.substring(3);
                } else if (c1 < 64 && c1 != 0) {
                    s = "" + (char) (c1 + 64) + s.substring(3);
                } else {
                    r = r + s.charAt(0);
                    s = s.substring(1);
                }
            } else {
                r = r + s.charAt(0);
                s = s.substring(1);
            }
        }
        r = r.substring(0, r.length() - 4);
        int[] rr = new int[r.length()];
        for (i = 0; i < r.length(); i++) {
            rr[i] = r.charAt(i);
        }
        return rr;
    }

    static void pp(Object o) {
        System.out.println(o);
    }
}