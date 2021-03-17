import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> collection;

    public Bedroom(int roomNumber, int capacity, String type) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.collection = new ArrayList<Guest>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean hasCapacity() {
        return this.capacity > collection.size();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Guest> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Guest> collection) {
        this.collection = collection;
    }

    public int guestCount() {
        return this.collection.size();
    }

    public void addGuest(Guest guest) {
        this.collection.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.collection.remove(guest);
    }

    public boolean isCheckedIn(Guest guest) {
        if(this.collection.contains(guest)) {
            return true;
        }
        return false;
    }
}
