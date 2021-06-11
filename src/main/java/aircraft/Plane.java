package aircraft;

public enum Plane {

    BOEING777(320, 172.00),
    AIRBUSA380(590, 580.00);

    public final int capacity;
    public final double totalWeight;

    Plane(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getWeight() {
        return this.totalWeight;
    }
}