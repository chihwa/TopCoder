public class Packhorses {
    public int horses(int p, int x, int y) {
        if (p == 0) {
            int a = x / 3;
            int b = y / 2;
            if (x % 3 != 0) a++;
            if (y % 2 != 0) b++;
            return a + b;
        } else {
            if (p == 1 && x % 3 == 0 && y % 2 == 1) {
                return 1 + horses(0, x, y - 1);
            }
            if (x > 0) {
                return 1 + horses(Math.max(0, p - 1), Math.max(0, x - 2), y);
            }
            return 1 + horses(Math.max(0, p - 1), x, Math.max(0, y - 1));
        }
    }
}