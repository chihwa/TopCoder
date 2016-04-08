import java.util.LinkedList;
import java.util.Queue;

public class TopBiologist {

    public String findShortestNewSequence(String sequence) {
        Queue<String> q = new LinkedList<>();
        q.offer("A");
        q.offer("C");
        q.offer("G");
        q.offer("T");
        while (true) {
            String s = q.poll();
            if (!sequence.contains(s)) {
                return s;
            }
            q.offer(s + "A");
            q.offer(s + "C");
            q.offer(s + "G");
            q.offer(s + "T");
        }
    }
}
