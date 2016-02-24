import java.util.stream.IntStream;

public class ProgressBar {

    public String showProgress(int[] taskTimes, int tasksCompleted) {
        int total = IntStream.of(taskTimes).sum();
        int partial = IntStream.of(taskTimes).limit(tasksCompleted).sum();
        float rate = (float) partial / total;
        int numSharp = (int) (20 * rate);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            if (i < numSharp) {
                sb.append("#");
            } else {
                sb.append(".");
            }
        }
        return sb.toString();
    }
}
