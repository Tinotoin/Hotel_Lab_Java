import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<Conference> conference;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conference = new ArrayList<Conference>();

    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void checkIn(Guest guest, Bedroom bedroom) {
        if (bedrooms.contains(bedroom)) {
            bedroom.addGuest(guest);
        }
    }

    public void checkOut(Guest guest) {
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.guests.contains(guest)) {
                bedroom.removeGuest(guest);
            }
        }
    }
}




