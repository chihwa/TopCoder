import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Chihwa on 1/20/2016.
 */
public class ListeningSongs {
    public int listen(int[] durations1, int[] durations2, int minutes, int T) {
        int time = minutes * 60;
        if (durations1.length < T ||
                durations2.length < T) {
            return -1;
        }

        Arrays.sort(durations1);
        Arrays.sort(durations2);
        for (int i = 0; i < T; i++) {
            time = time - (durations1[i] + durations2[i]);
        }

        if(time<0) return -1;

        List<Integer> r = new ArrayList<>();
        for (int i = T; i < durations1.length; i++) {
            r.add(durations1[i]);
        }
        for (int i = T; i < durations2.length; i++) {
            r.add(durations2[i]);
        }

        Collections.sort(r);

        int s = 2*T;
        while (!r.isEmpty() && time >= 0){
            time = time - r.remove(0);
            if(time<0) break;
            s++;
        }

        return s;
    }

    public static void main(String[] args) {
        int r = new ListeningSongs().listen(new int[]{100,200,300}, new int[]{100,200,300}, 2, 1);
        System.out.println(r);
    }
}
