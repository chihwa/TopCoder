package srm158;

/**
 * Created by Chihwa on 12/1/2015.
 */
public class BlackAndRed {
    public int cut(String deck) {

        int status = 0;
        int minStatus = Integer.MAX_VALUE;
        int minStatusIndex = -1;
        for (int i = 0; i < deck.length(); i++) {
            char c = deck.charAt(i);
            if (c == 'R') {
                status--;
            } else {
                status++;
            }

            if (status < 0 && status < minStatus) {
                minStatus = status;
                minStatusIndex = i;
            }
        }

        return minStatusIndex + 1;
    }
}
