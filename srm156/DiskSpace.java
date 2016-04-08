package srm156;

import java.util.Arrays;

public class DiskSpace {
    public int minDrives(int[] used, int[] total) {
        int size = used.length;
        int totalUsed = 0;
        int totalSize = 0;

        for (int i = 0; i < size; i++) {
            totalUsed += used[i];
            totalSize += total[i];
        }

        Arrays.sort(total);

        int free = totalSize - totalUsed;

        System.out.println("used=" + totalUsed);
        System.out.println("size=" + totalSize);
        System.out.println("free=" + free);

        int i = 0;
        do {
            free = free - total[i++];
        } while (free >= 0);

        return size - i + 1;

    }

    public static void main(String[] args) {
        DiskSpace temp = new DiskSpace();
        int[] used = {331, 242, 384, 366, 428, 114, 145, 89, 381, 170, 329, 190, 482, 246, 2, 38, 220, 290, 402, 385};
        int[] total = {992, 509, 997, 946, 976, 873, 771, 565, 693, 714, 755, 878, 897, 789, 969, 727, 765, 521, 961, 906};
        System.out.println(temp.minDrives(used, total));
    }
}
