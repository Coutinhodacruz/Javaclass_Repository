package eliteTest;

import eliteHotel.Hotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    Hotel hotel;
    @BeforeEach
    void startAllTestWith(){
         hotel = new Hotel(10);
        assertNotNull(hotel);
    }

    @Test

    void  testThatRoomCanBeBooked(){
       assertEquals("Room Successfully booked!!!",hotel.bookRoom("Dacruz"));

    }
    @Test
    void testUserCanCheckOut(){
        hotel.bookRoom("Dacruz");
        assertTrue(hotel.checkOut(1));
    }

    @Test
    void bookedRooms(){

        hotel.bookedRoom();
    }

    @Test
    void getAllRoomTest(){
       assertEquals(10, hotel.getRooms());

    }
    @Test
    void getAvailableRoomsTest() {
        hotel.bookRoom("you");
        hotel.bookRoom("wee");
        assertEquals(8,hotel.availableRoom());

    }

    @Test
    void  getRoomGuest(){
        hotel.bookRoom("house");
        assertTrue(hotel.RoomGuest(1));
    }

    @Test
    void getAllRoomGuest(){
        hotel.AllRoomGuest();
        hotel.bookRoom("book");
    }

}
