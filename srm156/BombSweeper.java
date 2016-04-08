package srm156;

/**
 * Created by Chihwa on 11/19/2015.
 */
public class BombSweeper {
    public double winPercentage(String[] board) {

        int nr = board.length;
        int nc = board[0].length();

        char cb[][] = new char[nr][nc];
        for (int i = 0; i < board.length; i++) {
            cb[i] = board[i].toCharArray();
        }

        int nl = 0;
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (cb[r][c] == 'B') {
                    nl++;
                    int rs = r - 1, re = r + 1, cs = c - 1, ce = c + 1;
                    if (r == 0) {
                        rs = r;
                    }
                    if (c == 0) {
                        cs = c;
                    }
                    if (r == nr - 1) {
                        re = r;
                    }
                    if (c == nc - 1) {
                        ce = c;
                    }
                    mark(cb, rs, re, cs, ce);
                }
            }
        }

        //count
        int nw = 0;
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (cb[r][c] == '.') {
                    nw++;
                }
            }
        }

        double rd = nw / (double) (nw + nl) * 100;
        return rd;
    }

    private void mark(char[][] cb, int rs, int re, int cs, int ce) {
        for (int r = rs; r <= re; r++) {
            for (int c = cs; c <= ce; c++) {
                if (cb[r][c] == '.') {
                    cb[r][c] = 'N';
                }
            }
        }
    }

    public static void main(String[] args) {
        double r = new BombSweeper().winPercentage(new String[]{
                ".....",
                ".....",
                "..B..",
                ".....",
                "....."});
        System.out.println(r);
    }
}
