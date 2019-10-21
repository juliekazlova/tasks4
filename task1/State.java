package by.epam.java.kazlova.task1;


//. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.


public class State {
    private City capital;
    private Region[] regions;
    private String name;

    public State(String namr, City capital, Region[] regions) {
        this.capital = capital;
        this.regions = regions;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public int countRegions(){
        return regions.length;
    }

}
