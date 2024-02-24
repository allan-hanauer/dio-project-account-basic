package open.allanhanauer.four;

import java.util.Arrays;

public class Accounts {
    private Account[] accounts;

    public Accounts(int size) {
        accounts = new Account[size];
    }

    public void createAccount(int index, Account account) {
        if (index >= 0 && index < accounts.length) {
            accounts[index] = account;
        } else {
            System.out.println("Índice inválido");
        }
    }

    public Account getAccount(int index) {
        if (index >= 0 && index < accounts.length) {
            return accounts[index];
        } else {
            System.out.println("Índice inválido");
            return null;
        }
    }
    public double getBalance(int index){
        if (index >= 0 && index < accounts.length){
            return accounts[index].getBalance();
        }else{
            System.out.println("Índice inválido");
            return 0;
        }
    }
    public void deposit(int index,double value){
        accounts[index].setBalance(value);
    }
    public void transfer(int sendingAccount,int receiveAccount,double value){
        if(accounts[sendingAccount].getBalance() >= value && getAccount(receiveAccount) != null){
            accounts[sendingAccount].setBalance(getBalance(sendingAccount)-value);
            accounts[receiveAccount].setBalance(getBalance(receiveAccount)+value);
        }
    }
    @Override
    public String toString() {
        return "Accounts [accounts=" + Arrays.toString(accounts) + "]";
    }
}
