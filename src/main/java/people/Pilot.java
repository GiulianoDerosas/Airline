package people;

public class Pilot {


    private String name;
    private Rank ranking;
    private String licenseNumber;


    public Pilot(String name, Rank rank, String licenseNumber) {
        this.name = name;
        this.ranking = rank;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return this.name;
    }

    public Rank getRank() {
        return this.ranking;
    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public String flyPlane() {
        return "I have control of the aircraft!";
    }

}
