import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> collectionBedrooms;
    private ArrayList<ConferenceRoom> collectionConferenceRooms;
//    ...
    private ArrayList<Guest> collectionGuests;

    public Hotel(String name) {
        this.name = name;
        this.collectionBedrooms = new ArrayList<Bedroom>();
        this.collectionConferenceRooms = new ArrayList<ConferenceRoom>();
//        ...
        this.collectionGuests = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int guestCount() {
        return this.collectionGuests.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.collectionBedrooms.add(bedroom);
    }

    public void checkInGuest(Guest guest, Bedroom bedroom) {
        if(bedroom.hasCapacity()) {
            this.collectionGuests.add(guest);
            bedroom.addGuest(guest);
        }
    }

    public void checkOutGuest(Guest guest, Bedroom bedroom) {
        if(bedroom.isCheckedIn(guest)) {
            this.collectionGuests.remove(guest);
            bedroom.removeGuest(guest);
        }
    }
}
