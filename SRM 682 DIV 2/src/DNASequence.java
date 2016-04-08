public class DNASequence {

    public int longestDNASequence(String sequence) {
        int r = 0;
        int c = 0;
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == 'A' ||
                    sequence.charAt(i) == 'C' ||
                    sequence.charAt(i) == 'G' ||
                    sequence.charAt(i) == 'T') {
                c++;
            } else {
                c = 0;
            }
            r = Math.max(r, c);
        }
        return r;
    }
}
