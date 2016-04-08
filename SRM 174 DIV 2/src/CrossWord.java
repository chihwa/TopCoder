public class CrossWord {

    public int countWords(String[] board, int size) {
        int r = 0;
        for (String row : board) {
            int count = 0;
            for (int j = 0; j < row.length(); j++) {
                if (row.charAt(j) == '.') {
                    count++;
                } else {
                    if (count == size) {
                        r++;
                    }
                    count = 0;
                }
            }
            if (count == size) {
                r++;
            }
        }
        return r;
    }
}
