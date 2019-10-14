package by.epam.java.kazlova.task4;

//. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного
//типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора
//транспорта, питания и числа дней. Реализовать выбор и сортировку

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

public class Trip {
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
}
