package by.epam.java.kazlova.task4;

import java.util.ArrayList;
import java.util.List;

public class AgencyLogic {

    public List<Trip> choseByTransport(Agency agency, TransportType transportType){
        List<Trip> trips=new ArrayList<>();
        for(Trip cur: agency.getTrips()){
            if(cur.getTransport()==transportType){
                trips.add(cur);
            }
        }
        return trips;
    }

    public List<Trip> choseByMeal(Agency agency, MealType mealType){
        List<Trip> trips=new ArrayList<>();
        for(Trip cur: agency.getTrips()){
            if(cur.getMeal()==mealType){
                trips.add(cur);
            }
        }
        return trips;
    }

    public List<Trip> choseByDaysNumber(Agency agency, int days) {
        List<Trip> trips=new ArrayList<>();
        for(Trip cur: agency.getTrips()){
            if(cur.getDaysCount()<=days){
                trips.add(cur);
            }
        }
    return trips;
    }


}
