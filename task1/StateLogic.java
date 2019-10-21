package by.epam.java.kazlova.task1;


//. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

public class StateLogic {
    public float countSquare(State state){
        float square=0;
        for(int i=0; i<state.countRegions(); i++){
            for(int j=0; j<state.getRegions()[i].getNeighborhoods().length; j++)
            square+=state.getRegions()[i].getNeighborhoods()[j].getSquare();
        }
        return square;
    }

    public City[] regionCenters(State state){
        City[] centers=new City[state.countRegions()];
        for(int i=0; i<state.countRegions(); i++){
            centers[i]=state.getRegions()[i].getRegionCenter();
        }
        return centers;
    }
}
