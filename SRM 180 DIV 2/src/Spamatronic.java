import java.util.*;

public class Spamatronic {

    public int[] filter(String[] knownSpam, String[] newMail) {
        Set<String> s = new HashSet<>();
        for (String spamLine : knownSpam) {
            String words[] = spamLine.split("[^A-Za-z']+");
            for (String word : words) {
                s.add(word.toLowerCase());
            }
        }

        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < newMail.length; i++) {
            String words[] = newMail[i].split("[^A-Za-z']+");
            int numTokens = words.length;
            int exists = 0;
            for (String word : words) {
                if (s.contains(word.toLowerCase())) exists++;
                s.add(word.toLowerCase());
            }
            if ((double) exists / numTokens < 0.75d) r.add(i);
        }
        System.out.println(Arrays.toString(r.stream().mapToInt(i -> i).toArray()));
        return r.stream().mapToInt(i -> i).toArray();
    }
}
