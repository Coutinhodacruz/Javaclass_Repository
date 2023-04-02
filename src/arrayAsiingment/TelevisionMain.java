package arrayAsiingment;

public class TelevisionMain {
    public static void main(String[] args) {

        Television television1 = new Television();
        television1.tvIsOn(true);
        television1.setTelevisionName("Samsung");
        television1.setTelevisionVolume();
        television1.setTelevisionChannel();


        Television television2 = new Television();
        television2.tvIsOn(true);
        television2.televisionChannelUp();
        television2.televisionChannelDown();
        television2.televisionVolumeUp();
        television2.televisionVolumeDown();

        System.out.println("tv1's channel is " + television1.newChannel
               + " and volume level is " + television1.newVolume);
        System.out.println("tv2's channel is " + television2.newChannel
               + " and volume level is " + television2.newVolume);
    }
}
