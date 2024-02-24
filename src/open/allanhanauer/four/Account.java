package open.allanhanauer.four;

import java.util.Arrays;

public class Account {
    private int number;
    private double balance;

    public Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [number=" + number + ", balance=" + balance + "]";
    }
}
