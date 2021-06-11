import org.junit.Before;
import org.junit.Test;
import people.Pilot;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Adam", Rank.CAPTAIN, "ABC123");
    }

    @Test
    public void hasName() {
        assertEquals("Adam", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicenseNumber() {
        assertEquals("ABC123", pilot.getLicenseNumber());
    }

    @Test
    public void canFlyThePlane() {
        assertEquals("I have control of the aircraft!", pilot.flyPlane());
    }

}
