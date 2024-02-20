public class ContaTerminal {
    private final int ID;
    private String agency;
    private String nameClient;
    private double balance;

    public ContaTerminal() {
        // Apenas emulando a caracteristica de um DB
        this.ID = 1 + (int)(Math.random() * 50 + 1);
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public double getBalance() {
        return balance;
    }

    public String getAgency() {
        return agency;
    }

    public String getNameClient() {
        return nameClient;
    }

    public int getID() {
        return ID;
    }
}
