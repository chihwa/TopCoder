public class StringTrain {

    public String buildTrain(String[] cars) {
        String Train = cars[0]; //Setup Train
        for (int index = 1; index < cars.length; index++) {
            for (int startSuffix = 1; startSuffix < Train.length(); startSuffix++) {
                String suffix = Train.substring(startSuffix);
                if (cars[index].startsWith(suffix) && suffix.length() != cars[index].length()) {
                    Train += cars[index].substring(suffix.length());
                    break; //stop looking for suffix
                }
            }
        }
        String ret = ""; //For returning
        for (int charPos = Train.length() - 1; charPos >= 0; charPos--) {
            char current = Train.charAt(charPos);
            if (!ret.contains(String.valueOf(current))) ret = current + ret;
        }
        return Train.length() + " " + ret;
    }
}
