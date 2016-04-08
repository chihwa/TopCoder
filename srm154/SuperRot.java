package srm154;

/**
 * Created by Chihwa on 11/18/2015.
 */
public class SuperRot {
    public String decoder(String message) {
        StringBuilder sb = new StringBuilder();
        char input[] = message.toCharArray();
        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            int val;
            if (c >= '0' && c <= '4') {
                val = 5;
            } else if (c >= '5' && c <= '9') {
                val = -5;
            } else if ((c >= 'a' && c <= 'm') || (c >= 'A' && c <= 'M')) {
                val = 13;
            } else if ((c >= 'n' && c <= 'z') || (c >= 'N' && c <= 'Z')) {
                val = -13;
            } else {
                val = 0;
            }
            sb.append((char) (c + val));
        }

        return sb.toString();
    }
}
