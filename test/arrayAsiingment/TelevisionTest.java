package arrayAsiingment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    Television television;
    @BeforeEach
    void startAllTestWith(){
        television = new Television();
        assertNotNull(television);
    }

    @Test
    public void TelevisionName(){

        television.setTelevisionName("Samsung");
        assertEquals("Samsung",television.getTelevisionName());
    }

    @Test
    public void TelevisionIsOn(){
        television.tvIsOn(true);
        boolean isOn = television.checkIsOn();
        assertTrue(isOn);
    }

    @Test
    public void TelevisionIsOff(){
        television.tvIsOn(true);
        television.tvIsOff(true);
        boolean isOff = television.checkISOff();
        assertTrue(isOff);

    }

    @Test
    public void setTelevisionChannel(){
        television.tvIsOn(true);
        television.setTelevisionChannel();
        int checkTvChannel = television.checkTelevisionChannel(1-30);
        assertEquals(1-30,television.checkTelevisionChannel(checkTvChannel));


    }
    @Test
    public void setTelevisionVolume(){
        television.tvIsOn(true);
        television.setTelevisionVolume();
        int checkTvVolume = television.checkTelevisionVolume(1-120);
        assertEquals(1-120,television.checkTelevisionVolume(checkTvVolume));
    }

    @Test
    public void setTelevisionChannelUp(){
        television.tvIsOn(true);
        television.televisionChannelUp();
        assertTrue(television.televisionChannelUp());
    }

    @Test
    public void setTelevisionChannelDown(){
        television.tvIsOn(true);
        television.televisionChannelDown();
        assertTrue(television.televisionChannelDown());
    }

    @Test
    public void setTelevisionVolumeUp(){
        television.tvIsOn(true);
        television.televisionVolumeUp();
        assertTrue(television.televisionVolumeUp());
    }

    @Test
    public void setTelevisionVolumeDown(){
        television.tvIsOn(true);
        television.televisionVolumeDown();
        assertTrue(television.televisionVolumeDown());
    }

}
