import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Guest guest1;
    private Guest guest2;

    private Bedroom bedroom1;
    private Bedroom bedroom2;

    @Before
    public void setUp() {
        bedroom1 = new Bedroom(1, 1, "Single");
        bedroom2 = new Bedroom(2, 2, "Double");
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

}
