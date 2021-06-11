import aircraft.Plane;
import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;
import people.Rank;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrewMember crew1;
    CabinCrewMember crew2;
    CabinCrewMember crew3;
    CabinCrewMember crew4;
    Passenger pax1;
    Passenger pax2;
    Passenger pax3;
    Passenger pax4;
    Passenger pax5;

    @Before
    public void before() {
        flight = new Flight(Plane.BOEING777, "EK025", "Glasgow", "Dubai", "11:50am");
        pilot1 = new Pilot("Mike", Rank.CAPTAIN, "ABC123");
        pilot2 = new Pilot("Tom", Rank.FO, "DEF456");
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        crew1 = new CabinCrewMember("Giuliano", Rank.GRADE2);
        crew2 = new CabinCrewMember("Sarah", Rank.GRADE1);
        crew3 = new CabinCrewMember("Hannah", Rank.CSV);
        crew4 = new CabinCrewMember("Catherine", Rank.PURSER);
        flight.addCrew(crew1);
        flight.addCrew(crew2);
        flight.addCrew(crew3);
        flight.addCrew(crew4);
        pax1 = new Passenger("George", 2);
        pax2 = new Passenger("Ethan", 1);
        pax3 = new Passenger("Nick", 2);
        pax4 = new Passenger("Sylvia", 1);
        pax5 = new Passenger("Yvonne", 2);
        flight.addPax(pax1);
        flight.addPax(pax2);
        flight.addPax(pax3);
        flight.addPax(pax4);
        flight.addPax(pax5);
    }

    @Test
    public void canAddPilots() {
        assertEquals(2, flight.pilots.size());
    }

    @Test
    public void canAddCrew() {
        assertEquals(4, flight.crewMembers.size());
    }

    @Test
    public void canAddPax() {
        assertEquals(5, flight.passengers.size());
    }

    @Test
    public void canShowAvailableSeats() {
        assertEquals(315, flight.getAvailableSeats());
    }

    @Test
    public void checkMaxBaggageWeight() {
        assertEquals(86.00, flight.calculateMaxBaggageWeight(), 0.0);
    }

    @Test
    public void checkBaggageWeight() {
        assertEquals(0.16, flight.calculateBaggageWeight(), 0.0);
    }

    @Test
    public void checkBaggageWeightAllowancePerPax() {
        assertEquals(0.26875, flight.baggageWeightAllowancePerPax(), 0.0);
    }

    @Test
    public void checkWeightAvailableForBaggage() {
        assertEquals(85.84, flight.weightAvailableForBaggage(), 0.0);
    }




}
