public class EllysTimeMachine {

    public String getTime(String time) {
        String times[] = time.split(":");

        int h = Integer.valueOf(times[0]);
        int m = Integer.valueOf(times[1]);

        int nh = m / 5;
        int nm = h * 5;

        if (nh == 0) nh = 12;
        if (nm == 60) nm = 0;
        return String.format("%02d:%02d", nh, nm);
    }
}
