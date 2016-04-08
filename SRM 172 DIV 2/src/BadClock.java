public class BadClock {

    public double nextAgreement(String trueTime, String skewTime, int hourlyGain) {
        String trueTimes[] = trueTime.split(":");
        String skewTimes[] = skewTime.split(":");
        long trueTimeLong = (Long.valueOf(trueTimes[0])) * 3600 +
                Long.valueOf(trueTimes[1]) * 60 +
                Long.valueOf(trueTimes[2]);
        long skewTimeLong = (Long.valueOf(skewTimes[0])) * 3600 +
                Long.valueOf(skewTimes[1]) * 60 +
                Long.valueOf(skewTimes[2]);

        long lead = trueTimeLong - skewTimeLong;

        if (hourlyGain < 0) {
            lead = skewTimeLong - trueTimeLong;
        }

        if (lead < 0) {
            lead += 12 * 60 * 60;
        }

        return Math.abs((double) lead / hourlyGain);

    }
}
