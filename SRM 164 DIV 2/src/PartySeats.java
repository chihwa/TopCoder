import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartySeats {

    public String[] seating(String[] attendees) {
        List<String> b = new ArrayList<>();
        List<String> g = new ArrayList<>();
        for (int i = 0; i < attendees.length; i++) {
            String nameSex[] = attendees[i].split(" ");
            if (nameSex[1].equals("boy")) {
                b.add(nameSex[0]);
            } else {
                g.add(nameSex[0]);
            }
        }

        if (b.size() != g.size() || b.size() % 2 != 0) {
            return new String[0];
        }

        Collections.sort(b);
        Collections.sort(g);

        int size = b.size() + g.size() + 2;
        String r[] = new String[size];

        boolean nextGirl = true;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                r[i] = "HOST";
                nextGirl = true;
            } else if (i == size / 2) {
                r[i] = "HOSTESS";
                nextGirl = false;
            } else if (nextGirl) {
                r[i] = g.remove(0);
                nextGirl = false;
            } else {
                r[i] = b.remove(0);
                nextGirl = true;
            }
        }


        return r;
    }
}
