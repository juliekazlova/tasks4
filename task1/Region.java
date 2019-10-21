package by.epam.java.kazlova.task1;

import java.util.Arrays;
import java.util.Objects;

public class Region {//область
    private City regionCenter;
    private Neighborhood[] neighborhoods;
    private String name;


    public Region(String name, City regionCenter, Neighborhood[] neighborhoods) {
        this.name = name;
        this.regionCenter = regionCenter;
        this.neighborhoods=neighborhoods;
    }

    public Region() {
        this.regionCenter = new City();
        this.neighborhoods=new Neighborhood[0];
    }


    public City getRegionCenter() {
        return regionCenter;
    }

    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public Neighborhood[] getNeighborhoods() {
        return neighborhoods;
    }

    public void setNeighborhoods(Neighborhood[] neighborhoods) {
        this.neighborhoods = neighborhoods;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder(super.toString());
        sb.append(", region center is ").append(regionCenter.toString());
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Region)) return false;
        if (!super.equals(o)) return false;
        Region region = (Region) o;
        return Objects.equals(getRegionCenter(), region.getRegionCenter()) &&
                Arrays.equals(getNeighborhoods(), region.getNeighborhoods());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), getRegionCenter());
        result = 31 * result + Arrays.hashCode(getNeighborhoods());
        return result;
    }
}
