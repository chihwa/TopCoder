package SRM151;

/**
 * Created by Chihwa on 10/29/2015.
 */
public class PrefixCode {
    public String isOne(String[] w) {
        int r = Integer.MAX_VALUE;
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w.length; j++) {
                if (i != j && w[i].startsWith(w[j])) {
                    if(j < r) {
                        r = j;
                    }
                }
            }
        }
        if (r == Integer.MAX_VALUE) {
            return "Yes";
        } else {
            return "No, " + r;
        }
    }

    public static void main(String[] args) {
        String r = new PrefixCode().isOne(new String[]{"6G9Lnpzw", "kA", "SyW9fFaF", "k", "SyW9fFa", "6G", "6", "SyW9f"});
        System.out.println(r);
    }
}
