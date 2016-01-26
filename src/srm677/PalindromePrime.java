package srm677;

/**
 * Created by Chihwa on 12/26/2015.
 */
public class PalindromePrime {
    private static boolean isPrime(int num) {
        if(num == 1) return false;
        if (num == 2 ) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }

    boolean isPalindrome(int in) {
        String s = String.valueOf(in);
        int n = s.length();
        for (int i=0;i<(n / 2) + 1;++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public int count(int L, int R){

        int r = 0;
        for (int i = L; i <= R; i++) {
            if(isPrime(i) && isPalindrome(i)){
                r++;
            }
        }

        return r;
    }
}
