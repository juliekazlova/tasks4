package by.epam.java.kazlova.task1;

public class Neighborhood extends Area {
    private City neighborhoodCenter;

    public Neighborhood(String name, float square, City neighborhoodCenter) {
        super(name, square);
        this.neighborhoodCenter = neighborhoodCenter;
    }

    public Neighborhood() {
        this.neighborhoodCenter = new City();
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder(super.toString());
        sb.append(", neighborhood center is ").append(neighborhoodCenter.toString());
        return sb.toString();
    }
}

