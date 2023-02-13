package CharpterTwo;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

//    int hours, minutes,seconds;

   public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {

        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;

    }

    public int getMinutes() {

        return minutes;
    }

    public void setMinutes(int minutes) {

       this.minutes = minutes;
    }

    public int getSeconds() {

        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;

//        for (int hours = 1; hours <=23 ; hours++) {
//            System.out.println(hours);
//            int time = (hours * 59) + (minutes * (hours - 59) *(seconds * 23) + 23);
//            hours += minutes;
//            minutes = seconds;


    }

    void display(){
        System.out.println(hours +":"+ minutes +":"+ seconds);
    }
    
}
