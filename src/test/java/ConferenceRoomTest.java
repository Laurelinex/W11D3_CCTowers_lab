import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;

    @Before
    public void setUp() {
        conferenceRoom1 = new ConferenceRoom("The Big Apple Room", 10);
    }

    @Test
    public void hasName() {
        assertEquals("The Big Apple Room", conferenceRoom1.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(10, conferenceRoom1.getCapacity());
    }

}
