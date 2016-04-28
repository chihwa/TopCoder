import java.util.ArrayList;
import java.util.List;

public class ParenthesesDiv2Medium {

    public int[] correct(String s) {
        List<Integer> r = new ArrayList<>();

        char in[] = s.toCharArray();
        int depth = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] == '(') depth++;
            else depth--;

            if (depth < 0) {
                r.add(i);
                depth = 1;
                continue;
            }

            int left = in.length - i;
            if (depth > left) {
                r.add(i);
                depth -= 2;
            }
        }

        return r.stream().mapToInt( (Integer i) -> i.intValue()).toArray();
    }
}
