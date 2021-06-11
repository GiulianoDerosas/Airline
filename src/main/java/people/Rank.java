package people;

public enum Rank {

    GRADE2("Grade 2"),
    GRADE1("Grade 1"),
    FG1("FG1"),
    CSV("CSV"),
    PURSER("Purser"),
    FO("First Officer"),
    CAPTAIN("Captain");

    private final String ranking;

    Rank(String ranking) {
        this.ranking = ranking;
    }

    public String getRank() {
        return ranking;
    }
}
