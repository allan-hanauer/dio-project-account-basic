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

    @Override
    public String toString() {
        return "Accounts [accounts=" + Arrays.toString(accounts) + "]";
    }
}
