package flight;

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
    private double weight;

    public Flight(Plane plane, String flightNumber,String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<Pilot>();
        this.crewMembers = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this. departureAirport = departureAirport;
        this. departureTime = departureTime;
        this.weight = 0.02;
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

//    Adding Flight Management Systems

    public double calculateMaxBaggageWeight() {
        return this.plane.getWeight() / 2;
    }


    public double calculateBaggageWeight() {
        double paxBaggageWeight = 0;
        for (Passenger passenger: this.passengers){
            paxBaggageWeight += (passenger.getNumberOfBags() * this.weight);
        }
        return paxBaggageWeight;
    }

    public double baggageWeightAllowancePerPax() {
        return (this.plane.getWeight() / 2) / this.plane.getCapacity();
    }

    public double weightAvailableForBaggage() {
        double paxBaggageWeight = 0;
        double weightAvailable = (this.plane.getWeight() / 2);

        for (Passenger passenger: this.passengers){
            paxBaggageWeight += (passenger.getNumberOfBags() * this.weight);
        }
        return weightAvailable - paxBaggageWeight;
    }
}
