import java.math.BigInteger;

public class LCMRange {

    private static int gcd(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

    public int lcm(int first, int last) {
        int ret = first;
        for (int i = first; i <= last; i++) {
            int g = gcd(ret, i);
            ret = ret / g * i;
        }
        return ret;
    }
}
