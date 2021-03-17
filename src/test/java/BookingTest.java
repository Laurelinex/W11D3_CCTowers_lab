import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking1;
    private Bedroom bedroom1;


    @Before
    public void setUp() throws Exception {
        bedroom1 = new Bedroom(1, 1, "Single");
        booking1 = new Booking(bedroom1, 2);


    }

    @Test
    public void hasBedroom() throws Exception {
        assertEquals(1, booking1.getBedroom());
    }


}
