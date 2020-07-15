import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    public ArrayList<Guest> guests; //check that this shouldn't be public
    private String type;

    public Bedroom(int roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (guestCount() < this.capacity) {
            this.guests.add(guest);
        } else {
            System.out.println("Piss off, we're full!");
        }

    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
