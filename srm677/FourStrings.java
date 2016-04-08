package srm677;

import java.util.ArrayList;

/**
 * Created by Chihwa on 12/26/2015.
 */
public class FourStrings {
    private static int overlap(String s1, String s2)
    {
        int s1last = s1.length() - 1;
        int s2len = s2.length();
        int overlap = 0;
        for (int i = s1last, j = 1; i > 0 && j < s2len; i--, j++)
        {
            String suff = s1.substring(i);
            String pref = s2.substring(0, j);
            if (suff.equals(pref)) overlap = j;
        }
        return overlap;
    }

    public static String createSuperString(ArrayList<String> strings)
    {
        while (strings.size() > 1)
        {
            int maxoverlap = 0;
            String msi = strings.get(0), msj = strings.get(1);
            for (String si : strings)
                for (String sj : strings)
                {
                    if (si.equals(sj)) continue;
                    int curoverlap = overlap(si, sj);
                    if (curoverlap > maxoverlap)
                    {
                        maxoverlap = curoverlap;
                        msi = si; msj = sj;
                    }
                }

            strings.add(merge(msi, msj, maxoverlap));
            strings.remove(msi);
            strings.remove(msj);
        }
        return strings.get(0);
    }

    private static String merge(String s1, String s2, int len)
    {
        s2 = s2.substring(len);
        return s1 + s2;
    }

    public int shortestLength(String a, String b, String c, String d){
        ArrayList<String> s = new ArrayList<>();
        s.add(a);
        s.add(b);
        s.add(c);
        s.add(d);

        return createSuperString(s).length();
    }

    public static void main(String[] args) {
        int r = new FourStrings().shortestLength("aba",
                "b",
                "b",
                "b");
        System.out.println(r);
    }
}
