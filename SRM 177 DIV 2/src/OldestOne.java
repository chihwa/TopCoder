import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OldestOne {

    public String oldest(String[] data) {
        int oldestAge = 0;
        String oldestName = "";

        Pattern p = Pattern.compile("(^[A-Z ]+)(\\d+)");
        for (String aData : data) {
            Matcher m = p.matcher(aData);
            if (m.find()) {
                String name = m.group(1).trim();
                int age = Integer.parseInt(m.group(2));
                if (age > oldestAge) {
                    oldestAge = age;
                    oldestName = name;
                }
            }
        }
        return oldestName;
    }
}
