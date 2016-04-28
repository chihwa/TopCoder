public class Stairs {

    public int designs(int maxHeight, int minWidth, int totalHeight, int totalWidth) {
        int ret = 0;
        for (int height = 1; height <= maxHeight; height++) {
            if (totalHeight % height != 0) continue;
            int numWidth = totalHeight / height - 1;
            if (numWidth == 0 || totalWidth % numWidth != 0 || totalWidth/numWidth < minWidth ) continue;
            ret++;
        }
        return ret;
    }
}
