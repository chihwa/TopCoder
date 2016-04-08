public class EqualSubstrings2 {

    public int get(String s) {
        int r=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                for (int k = j; k <s.length() ; k++) {
                    for (int l = k +1; l <=s.length() ; l++) {
                        String sub2 = s.substring(k, l);
                        if(sub.equals(sub2)){
                            r++;
                        }
                    }
                }

            }
        }
        return r;
    }

}
