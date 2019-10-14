package by.epam.java.kazlova.task4;

public class Agency {
    private Trip[] trips;

    public Agency(Trip[] trips) {
        this.trips = trips;
    }

    public Trip[] getTrips() {
        return trips;
    }

    public void setTrips(Trip[] trips) {
        this.trips = trips;
    }

    public void addTrip(Trip trip){
        Trip[] newTrips= new Trip[trips.length+1];
        for(int i=0; i<trips.length; i++){
            newTrips[i]=trips[i];
        }
        newTrips[trips.length]=trip;
        this.trips=newTrips;
    }
}
