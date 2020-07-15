import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;

    private Conference conference1;
    private Conference conference2;

    private Guest guest1;
    private Guest guest2;

    @Before
    public void before() {

        hotel = new Hotel();

        bedroom1 = new Bedroom(100, 2, "single");
        bedroom2 = new Bedroom(200, 4, "double");
        bedroom3 = new Bedroom(300, 2, "single");

        conference1 = new Conference("Willow", 20);
        conference2 = new Conference("Elm", 50);

        guest1 = new Guest("Tino");
        guest2 = new Guest("Stuart");

        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
    }

    @Test
    public void roomCanAddGuest() {
        bedroom1.addGuest(guest1);

        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void hotelCanCheckInAndOutGuest() {
        hotel.checkIn(guest1, bedroom1);
        assertEquals(1, bedroom1.guestCount());

        hotel.checkOut(guest1);
        assertEquals(0, bedroom1.guestCount());
    }
}
