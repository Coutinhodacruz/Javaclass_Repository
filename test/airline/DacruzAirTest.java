package airline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DacruzAirTest {
   private DacruzAir dacruzAir;

    @BeforeEach
    void setUp(){
        dacruzAir = new DacruzAir();

    }
    @Test
    public void testDacruzAirHasTenSeats(){
        //when
       boolean[] seats = dacruzAir.getSeats();
       assertEquals(10,seats.length);

    }
    @Test
    public  void testThatCustomersCanBookFirstClassTicket(){
        int firstClassTicketBooking = 1;
        dacruzAir.bookTicket(firstClassTicketBooking);
        assertTrue(dacruzAir.getSeats()[0]);
        dacruzAir.bookTicket(firstClassTicketBooking);
        assertTrue(dacruzAir.getSeats()[1]);


    }
    @Test
    public  void testThatCustomerCanBookEconomyClassTicket(){
        int economyClassTicketBookingRequest = 2;
        dacruzAir.bookTicket(economyClassTicketBookingRequest);
        assertTrue(dacruzAir.getSeats()[5]);

    }
}
