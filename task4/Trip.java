package by.epam.java.kazlova.task4;

//. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного
//типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
//транспорта, питания и числа дней. Реализовать выбор и сортировку

import java.util.Objects;

enum TripType{
    VACATION,
    EXCURSION,
    TREATMENT,
    SHOPPING,
    CRUIZE

}

enum TransportType{
    BUS,
    AVIA,
    CAR,
    TRAIN
}

enum MealType{
    NONE,
    ALLINCLUSIVE,
    HALFBOARD,
    BREAKFAST
}

public class Trip implements Comparable<Trip>{
    private TripType type;
    private TransportType transport;
    private MealType meal;
    private int daysCount;
    private float price;

    public Trip(TripType type, TransportType transport, MealType meal, int daysCount, float price) {
        this.type = type;
        this.transport = transport;
        this.meal = meal;
        this.daysCount = daysCount;
        this.price = price;
    }

    public TripType getType() {
        return type;
    }

    public void setType(TripType type) {
        this.type = type;
    }

    public TransportType getTransport() {
        return transport;
    }

    public void setTransport(TransportType transport) {
        this.transport = transport;
    }

    public MealType getMeal() {
        return meal;
    }

    public void setMeal(MealType meal) {
        this.meal = meal;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trip)) return false;
        Trip trip = (Trip) o;
        return getDaysCount() == trip.getDaysCount() &&
                Float.compare(trip.getPrice(), getPrice()) == 0 &&
                getType() == trip.getType() &&
                getTransport() == trip.getTransport() &&
                getMeal() == trip.getMeal();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getTransport(), getMeal(), getDaysCount(), getPrice());
    }

    @Override
    public String toString() {
        return "Trip{" +
                "type=" + type +
                ", transport=" + transport +
                ", meal=" + meal +
                ", daysCount=" + daysCount +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Trip o) {
       //?????
        return 0;
    }
}
