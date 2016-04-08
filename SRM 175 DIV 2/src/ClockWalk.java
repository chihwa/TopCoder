public class ClockWalk {

    public int finalPosition(String flips) {
        int r = 0;
        for (int i = 0; i < flips.length(); i++) {
            if (flips.charAt(i) == 'h') {
                r += i + 1;
            } else {
                r -= i + 1;
            }
        }
        r %= 12;
        if (r <= 0) r += 12;
        return r;
    }
}
