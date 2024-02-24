package open.allanhanauer.four;

public class Main {
    public static void main(String[] args) {
        Accounts accountManager = new Accounts(3);
        accountManager.createAccount(0, new Account(1, 1000));
        accountManager.createAccount(1, new Account(2, 2000));
        accountManager.createAccount(2, new Account(3, 3000));

        System.out.println("Accounts:");
        for (int i = 0; i < 3; i++) {
            System.out.println(accountManager.getAccount(i));
        }
    }
}
