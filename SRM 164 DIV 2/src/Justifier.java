public class Justifier {

    public String[] justify(String[] textIn) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < textIn.length; i++) {
            if (textIn[i].length() > max) {
                max = textIn[i].length();
            }
        }

        for (int i = 0; i < textIn.length; i++) {
            textIn[i] = rightJustify(textIn[i], max);
        }
        return textIn;
    }

    private String rightJustify(String s, int max) {
        char o[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        int oi = 0;
        for (int i = 0; i < max; i++) {
            if (i < max - o.length) {
                sb.append(" ");
            } else {
                sb.append(o[oi++]);
            }
        }

        return sb.toString();
    }
}
