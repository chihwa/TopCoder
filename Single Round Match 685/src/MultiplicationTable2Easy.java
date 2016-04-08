public class MultiplicationTable2Easy {

    public String isGoodSet(int[] table, int[] t) {
        int n = (int) Math.sqrt(table.length);
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                int num = table[t[i] * n + t[j]];
                int k = 0;
                for (; k < t.length; k++) {
                    if (t[k] == num) {
                        break;
                    }
                }
                if (k == t.length) {
                    return "Not Good";
                }
            }
        }
        return "Good";
    }
}
