package by.epam.java.kazlova.task3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientLogic {
    public float currentSum(Client client){
        float sum=0;
        for(Account cur: client.getAccounts()){
            sum+=cur.getSum();
        }
        return sum;
    }

    public float currentSumNegative(Client client){
        float sum=0;
        for(Account cur: client.getAccounts()){
           if(!cur.isBlocked()&&cur.getSum()<0)
            sum+=cur.getSum();
        }
        return sum;
    }

    public float currentSumPositive(Client client){
        float sum=0;
        for(Account cur: client.getAccounts()){
            if(!cur.isBlocked()&&cur.getSum()>0)
                sum+=cur.getSum();
        }
        return sum;
    }

    public Account findAccount(Client client, int id){
        for(Account cur: client.getAccounts()){
            if(cur.getId()==id){
                return cur;
            }
        }
        return null;
    }

    public ArrayList<Account> sortAccounts(Client client){
        ArrayList<Account> sorted= new ArrayList<>(client.getAccounts());
                Collections.sort(sorted);
       return sorted;
    }
}
