package ChapterEight;

public class Time {

    private int hour;
    private int minute;
    private int seconds;


    public Time(int hour, int minute, int seconds){
        validate(hour,minute,seconds);

        this.hour = hour;
        this.minute = minute;
        this.seconds =  seconds;
    }

    public Time(int hour, int minute){

        this(hour,minute,0);
    }

    public Time(int hour){

        this(hour,0);
    }

    public static void validate(int hour, int minute, int seconds){
        validateHour(hour);
        validateMinute(minute);
        validateSeconds(seconds);

    }

    public static void validateHour(int hour){
        boolean hourIsInvalid = hour < 0 || hour > 23;
        if (hourIsInvalid) throw new IllegalArgumentException("Hour should be between 0 and 23");

    }
    public static void validateMinute(int minute){
        boolean minuteIsInvalid = minute < 0 || minute > 59;
        if (minuteIsInvalid) throw new IllegalArgumentException("Minute should be between 0 and 59");

    }

    public static void validateSeconds(int seconds){
        boolean secondsIsInvalid = seconds < 0 || seconds > 60;
        if (secondsIsInvalid) throw new IllegalArgumentException("Seconds should be between 0 and 60");

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        validateSeconds(seconds);
        this.seconds = seconds;
    }

    public int getMinute() {

        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

}
