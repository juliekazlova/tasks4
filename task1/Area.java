package by.epam.java.kazlova.task1;

public class Area {
    private String name;
    private float square;

    public Area(String name, float square) {
        this.name = name;
        this.square = square;
    }

    public Area() {
        this.name = "NO_NAME";
        this.square = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSquare() {
        return square;
    }

    public void setSquare(float square) {
       if(square>0) {
           this.square = square;
       }
       else this.square=0;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(name).append(", ").append(square).append("sqr km");
        return sb.toString();
    }
}
