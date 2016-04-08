import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordForm {

    public String getSequence(String word) {
        Set<Character> vs = new HashSet<>(Arrays.asList(
                new Character[]{'A', 'E', 'I', 'O', 'U'}));
        char[] input = word.toUpperCase().toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            if (vs.contains(input[i])) {
                sb.append("V");
            } else if (i != 0 &&
                    input[i] == 'Y' &&
                    sb.charAt(i - 1) == 'C') {
                sb.append("V");
            } else {
                sb.append("C");
            }
        }

        StringBuilder r = new StringBuilder();
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) != sb.charAt(i + 1)) {
                r.append(sb.charAt(i));
            }
        }
        r.append(sb.charAt(sb.length() - 1));
        return r.toString();
    }
}
