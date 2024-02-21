package open.allanhanauer.first;

import open.allanhanauer.first.ContaTerminal;

import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner inp = new Scanner(System.in);
        ContaTerminal account = new ContaTerminal();
        System.out.println("Por Favor, digite o Número da Agência");
        account.setAgency(inp.nextLine());
        System.out.println("Por Favor, digite o Seu nome");
        account.setNameClient(inp.nextLine());
        System.out.println("Por Favor, digite o seu Saldo");
        account.setBalance(inp.nextDouble());
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",account.getNameClient(),account.getAgency(),account.getID(),account.getBalance());
    }
}
