package by.epam.java.kazlova.task1;

public class Region extends Area{//область
    private City regionCenter;
    private Neighborhood[] neighborhoods;

    public Region(String name, float square, City regionCenter) {
        super(name, square);
        this.regionCenter = regionCenter;
        this.neighborhoods=new Neighborhood[0];
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

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder(super.toString());
        sb.append(", region center is ").append(regionCenter.toString());
        return sb.toString();
    }
}
