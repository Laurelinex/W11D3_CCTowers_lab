import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;

    private Guest guest1;

    @Before
    public void setUp() throws Exception {
        bedroom1 = new Bedroom(1, 1, "Single", 10.50);
        bedroom2 = new Bedroom(2, 2, "Double", 20.50);
        guest1 = new Guest("Larry");
    }

    @Test
    public void hasNumber() {
        assertEquals(1, bedroom1.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(1, bedroom1.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals("Single", bedroom1.getType());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void canAddGuest() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canRemoveGuest() {
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest(guest1);
        assertEquals(0, bedroom1.guestCount());
    }

}
