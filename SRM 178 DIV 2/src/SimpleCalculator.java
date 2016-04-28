import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleCalculator {

    public int calculate(String input) {
        Pattern p = Pattern.compile("(^\\d+)(.)(\\d+)");
        Matcher m = p.matcher(input);
        if (m.find()) {
            int first = Integer.parseInt(m.group(1));
            String op = m.group(2);
            int second = Integer.parseInt(m.group(3));
            switch (op) {
                case "+":
                    return first + second;
                case "-":
                    return first - second;
                case "*":
                    return first * second;
                case "/":
                    return first / second;
            }
        }
        return 0;
    }
}
