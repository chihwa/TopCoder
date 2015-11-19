package SRM151;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Chihwa on 10/29/2015.
 */
public class Birthday {
    public String getNext(String d, String[] b) {

        List<Integer> q = new ArrayList<>();
        for (String date : b) {
            Integer month = Integer.valueOf(date.split("/| ")[0]);
            Integer day = Integer.valueOf(date.split("/| ")[1]);
            Integer num = month * 100 + day;
            q.add(num);
        }

        Collections.sort(q);

        int month = Integer.valueOf(d.split("/")[0]) * 100;
        int day = Integer.valueOf(d.split("/")[1]);
        int today = month + day;

        for (int i = 0; i < q.size(); i++) {
            int cur = q.get(i);
            if(today<=cur){
                return convert(cur);
            }
        }
        return convert(q.get(0));
    }

    private String convert(Integer first) {
        int m = first / 100;
        int d = first % 100;

        return String.format("%02d/%02d", m, d);
    }

    public static void main(String[] args) {
        String r = new Birthday().getNext("09/13", new String[]{"09/12 Gunar", "01/01 Emily"});
        System.out.println(r);
    }
}
