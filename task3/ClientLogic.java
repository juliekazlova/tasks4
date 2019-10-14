package by.epam.java.kazlova.task3;

import java.util.ArrayList;
import java.util.Collections;

public class ClientLogic {
    public float currentSum(Client client){
        float sum=0;
        for(int i=0; i<client.getAccounts().length; i++){
            if(!client.getAccounts()[i].isBlocked()) {
                sum += client.getAccounts()[i].getSum();
            }
        }
        return sum;
    }

    public float currentSumNegative(Client client){
        float sum=0;
        for(int i=0; i<client.getAccounts().length; i++){
           if(!client.getAccounts()[i].isBlocked()&&client.getAccounts()[i].getSum()<0)
            sum+=client.getAccounts()[i].getSum();
        }
        return sum;
    }

    public float currentSumPositive(Client client){
        float sum=0;
        for(int i=0; i<client.getAccounts().length; i++){
            if(!client.getAccounts()[i].isBlocked()&&client.getAccounts()[i].getSum()>0)
                sum+=client.getAccounts()[i].getSum();
        }
        return sum;
    }

    public Account findAccount(Client client, int id){
        for(int i=0; i<client.getAccounts().length; i++){
            if(client.getAccounts()[i].getId()==id){
                return client.getAccounts()[i];
            }
        }
        return null;
    }

    public Account[] sortAccounts(Client client){
        Account[] sorted=new Account[client.getAccounts().length];//?
       return null;
    }
}
