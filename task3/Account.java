package by.epam.java.kazlova.task3;

public class Account implements Comparable<Account>{
    private static int accountsCount=0;
    private int id;
    private boolean blocked=false;
    private float sum;

    public Account(float sum) {
        this.sum = sum;
        id=accountsCount;
        accountsCount++;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public int getId() {
        return id;
    }

    public void setBlocked(boolean block) {
        this.blocked = block;
    }

    @Override
    public int compareTo(Account o) {
        if(sum>o.getSum()){
            return 1;
        }
        if(sum<o.getSum()){
            return -1;
        }
        return 0;
    }
}
