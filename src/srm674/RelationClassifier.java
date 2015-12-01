package srm674;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chihwa on 11/30/2015.
 */
public class RelationClassifier {
    public String isBijection(int[] domain, int[] range) {
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();

        for (int i = 0; i < domain.length; i++) {
            int d = domain[i];
            int r = range[i];

            if (m1.containsKey(d) && m1.get(d) != r) {
                return "Not";
            }

            m1.put(d, r);

            if (m2.containsKey(r) && m2.get(r) != d) {
                return "Not";
            }

            m2.put(r, d);
        }

        return "Bijection";
    }

    public static void main(String[] args) {
        String r = new RelationClassifier().isBijection(new int[]{1, 3}, new int[]{2, 2});
        System.out.println(r);
    }
}
