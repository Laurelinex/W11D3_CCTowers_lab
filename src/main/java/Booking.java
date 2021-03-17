public class Booking {

    private Bedroom bedroom;
    private int nightsBooked;

    public Booking (Bedroom bedroom, int nightsBooked) {
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;

    }

    public int getBedroom() {
        return bedroom.getRoomNumber();
    }

    public int getNightsBooked() {
        return nightsBooked;
    }

    public double getRoomRate() {
        return this.bedroom.getRate();
    }
}



