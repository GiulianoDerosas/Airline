package flight;

import jdk.jfr.internal.consumer.RecordingInput;
import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;
import aircraft.Plane;

import java.util.ArrayList;

public class Flight {

    public ArrayList<Pilot> pilots;
    public ArrayList<CabinCrewMember> crewMembers;
    public ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber,String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<Pilot>();
        this.crewMembers = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this. departureAirport = departureAirport;
        this. departureTime = departureTime;
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public void addCrew(CabinCrewMember cabinCrewMember) {
        this.crewMembers.add(cabinCrewMember);
    }

    public int getAvailableSeats() {
       return this.plane.getCapacity() - passengers.size();
    }

    public void addPax(Passenger passenger) {
        if (passengers.size() < this.plane.getCapacity())
        this.passengers.add(passenger);
    }
}
