package by.epam.java.kazlova.task1;

import java.util.Arrays;
import java.util.Objects;

public class Neighborhood  {
    private City neighborhoodCenter;
    private City[] cities;
    private String name;
    private long square;

    public Neighborhood(String name, long square, City neighborhoodCenter, City[] cities) {
        this.name = name;
        this.square = square;
        this.neighborhoodCenter = neighborhoodCenter;
        this.cities=cities;
    }

    public Neighborhood() {
        this.neighborhoodCenter = new City();
        this.cities=new City[]{neighborhoodCenter};
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSquare() {
        return square;
    }

    public void setSquare(long square) {
        this.square = square;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder(super.toString());
        sb.append(", neighborhood center is ").append(neighborhoodCenter.toString());
        return sb.toString();
    }

    public City getNeighborhoodCenter() {
        return neighborhoodCenter;
    }

    public void setNeighborhoodCenter(City neighborhoodCenter) {
        this.neighborhoodCenter = neighborhoodCenter;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Neighborhood)) return false;
        if (!super.equals(o)) return false;
        Neighborhood that = (Neighborhood) o;
        return Objects.equals(getNeighborhoodCenter(), that.getNeighborhoodCenter()) &&
                Arrays.equals(getCities(), that.getCities());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), getNeighborhoodCenter());
        result = 31 * result + Arrays.hashCode(getCities());
        return result;
    }
}

