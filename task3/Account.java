package by.epam.java.kazlova.task3;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return getId() == account.getId() &&
                isBlocked() == account.isBlocked() &&
                Float.compare(account.getSum(), getSum()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), isBlocked(), getSum());
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", blocked=" + blocked +
                ", sum=" + sum +
                '}';
    }
}
