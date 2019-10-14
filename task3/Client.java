package by.epam.java.kazlova.task3;

//. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
//имеющим положительный и отрицательный балансы отдельно.


public class Client {
    private String name;
    private Account[] accounts;

    public Client(String name, Account[] accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account acount){
        Account[] newAccounts= new Account[accounts.length+1];
        for(int i=0; i<accounts.length; i++){
            newAccounts[i]=accounts[i];
        }
        newAccounts[accounts.length]=acount;
        this.accounts=newAccounts;
    }
}
