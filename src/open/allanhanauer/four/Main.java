package open.allanhanauer.four;

public class Main {
    public static void main(String[] args) {
        Accounts dioBank = new Accounts(3);
        dioBank.createAccount(0, new Account(1, 1000));
        dioBank.createAccount(1, new Account(2, 2000));
        dioBank.createAccount(2, new Account(3, 3000));
        System.out.println(dioBank.getBalance(0));
        System.out.println(dioBank.getBalance(1));
        dioBank.deposit(2,250);
        dioBank.deposit(1,550);
        dioBank.transfer(1,0,250);
        dioBank.transfer(2,1,420);
        System.out.println(dioBank.getBalance(0));
        System.out.println(dioBank.getBalance(1));
        System.out.println(dioBank.getBalance(2));
        System.out.println("Accounts:");
        for (int i = 0; i < 3; i++) {
            System.out.println(dioBank.getAccount(i));
        }
    }
}
