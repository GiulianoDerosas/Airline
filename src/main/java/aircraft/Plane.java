package aircraft;

public enum Plane {

    BOEING777(320, 172),
    AIRBUSA380(590, 580);

    public final int capacity;
    public final int totalWeight;

    Plane(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.totalWeight;
    }
}