public class KiloMan {

    public int hitsTaken(int[] pattern, String jumps) {
        int r = 0;
        for (int i = 0; i < pattern.length; i++) {
            if (jumps.charAt(i) == 'S' && pattern[i] <= 2 ||
                    jumps.charAt(i) == 'J' && pattern[i] > 2) r++;
        }
        return r;
    }
}
