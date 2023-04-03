package arrayAsiingment;

public class Television {

    private String televisionName;
    private boolean isOn;
    private boolean isOff;

    int newChannel = 1;
    int newVolume = 1;


    public void setTelevisionName(String name) {

        this.televisionName = name;
    }
    public String getTelevisionName(){

        return televisionName;
    }

    public void tvIsOn(boolean on) {

        this.isOn = on;
    }


    public boolean checkIsOn() {
        return  isOn;
    }

    public void tvIsOff(boolean off) {
        this.isOff = off;
    }

    public boolean checkISOff() {
        return isOff;
    }

    public void setTelevisionChannel() {
    }

    public int checkTelevisionChannel(int channel) {
        if (isOn && channel >= 1 && channel <= 120)
            newChannel = channel;

        return channel;
    }

    public void setTelevisionVolume() {
    }

    public int checkTelevisionVolume(int volume) {
        if (isOn && volume >= 1 && volume <= 50)
            newVolume = volume;

        return volume;
    }

    public boolean televisionChannelUp() {
        if (isOn && newChannel < 120)

            newChannel++;
        return true;
    }

    public boolean televisionChannelDown() {
        if (isOn && newChannel > 120)

            newChannel--;
        return true;
    }

    public boolean televisionVolumeUp() {
        if (isOn && newVolume > 50)

            newVolume++;
        return true;
    }

    public boolean televisionVolumeDown() {
        if (isOn && newVolume < 50)

            newVolume--;

        return true;
    }
}
