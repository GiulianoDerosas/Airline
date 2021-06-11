package people;

public class CabinCrewMember {

    private String name;
    private Rank ranking;


    public CabinCrewMember(String name, Rank rank) {
        this.name = name;
        this.ranking = rank;
    }

    public String getName() {
        return this.name;
    }

    public Rank getRank() {
        return ranking;
    }

    public String relayMessage() {
        return "Please fasten your seatbelt, we are expecting turbulence";
    }


}
