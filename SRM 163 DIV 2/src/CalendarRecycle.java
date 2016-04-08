public class CalendarRecycle {

    public boolean isLeap(int y) {
        return (y % 4 == 0) && (y % 100 != 0) ||
                (y % 400 == 0);
    }

    public int useAgain(int year) {
        int r=0;
        int i;
        boolean isLeapYear = isLeap(year);
        for (i = year+1; ; i++) {
            if(isLeap(i-1)){
                r+=2;
            }else{
                r++;
            }
            if(r%7==0 && (isLeapYear==isLeap(i))) break;
        }
        return i;
    }

    public static void main(String[] args) {
        boolean r = new CalendarRecycle().isLeap(2022);
        System.out.println(r);
    }

}
