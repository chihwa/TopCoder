public class DinkyFish {

    public int monthsUntilCrowded(int tankVolume, int maleNum, int femaleNum) {
        int r = 0;
        while (maleNum + femaleNum <= tankVolume * 2) {
            int min = Math.min(maleNum, femaleNum);
            maleNum += min;
            femaleNum += min;
            r++;
        }
        return r;
    }
}
