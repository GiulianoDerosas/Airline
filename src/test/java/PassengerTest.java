import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Ewan", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Ewan", passenger.getName());
    }

    @Test
    public void hasBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void hasOnFlightProperty() {
        assertFalse(passenger.isOnFlight());
    }

}
