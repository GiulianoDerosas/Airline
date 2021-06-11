import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Giuliano", Rank.GRADE2);
    }

    @Test
    public void hasName() {
        assertEquals("Giuliano", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.GRADE2, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessage() {
        assertEquals("Please fasten your seatbelt, we are expecting turbulence", cabinCrewMember.relayMessage());
    }

}
