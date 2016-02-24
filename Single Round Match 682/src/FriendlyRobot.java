public class FriendlyRobot {

    public int findMaximumReturns(String instructions, int changesAllowed) {

        int ud = 0;
        int lr = 0;
        int numClap = 0;

        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == 'U') {
                ud++;
            } else if (instructions.charAt(i) == 'D') {
                ud--;
            } else if (instructions.charAt(i) == 'L') {
                lr++;
            } else {
                lr--;
            }

            if (ud == 0 && lr == 0) {
                numClap++;
            }
        }

        int numClap2=0;
        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == 'U') {
                ud++;
            } else if (instructions.charAt(i) == 'D') {
                ud--;
            } else if (instructions.charAt(i) == 'L') {
                lr++;
            } else {
                lr--;
            }

            if (ud == 0 && lr == 0) {
                numClap2++;
            }else if (Math.abs(ud) + Math.abs(lr) == 2 && changesAllowed > 0) {
                changesAllowed--;
                ud = 0;
                lr = 0;
                numClap2++;
            }
        }

        return Math.max(numClap, numClap2);
    }
}
