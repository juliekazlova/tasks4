package by.epam.java.kazlova.task1;


//. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.


public class State {
    private City capital;
    private Region[] regions;

    public State(City capital, Region[] regions) {
        this.capital = capital;
        this.regions = regions;
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
