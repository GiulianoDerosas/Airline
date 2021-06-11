package people;

public class Passenger {

    public boolean onFlight;
    private String name;
    private Integer numberOfBags;

    public Passenger(String name, Integer numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.onFlight = false;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfBags() {
        return this.numberOfBags;
    }

    public boolean isOnFlight() {
        return this.onFlight;
    }
}
