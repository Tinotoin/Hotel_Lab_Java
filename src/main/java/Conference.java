import java.util.ArrayList;

public class Conference {

    private String name;
    private int capacity;
    private ArrayList<Guest> guest;

    public Conference(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guest = new ArrayList<Guest>();
    }
}
