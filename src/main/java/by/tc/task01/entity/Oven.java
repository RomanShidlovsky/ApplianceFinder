package by.tc.task01.entity;

public class Oven extends Appliance {
    public int powerConsumption;
    public double weight;
    public int capacity;
    public double depth;
    public double height;
    public double width;

    @Override
    public String toString() {
        return String.format("Oven: POWER_CONSUMPTION=%d, WEIGHT=%.1f, CAPACITY=%d, DEPTH=%.1f, HEIGHT=%.1f, WIDTH=%.1f",
                powerConsumption, weight, capacity, depth, height, width);
    }
}
