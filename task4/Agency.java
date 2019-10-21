package by.epam.java.kazlova.task4;

import java.util.List;
import java.util.Objects;

public class Agency {
    private List<Trip> trips;

    public Agency(List<Trip> trips) {
        this.trips = trips;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Agency)) return false;
        Agency agency = (Agency) o;
        return Objects.equals(getTrips(), agency.getTrips());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTrips());
    }


}


