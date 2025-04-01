import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Qual o número da sua conta? ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Qual a sua agência? ");
        String agencia = scanner.nextLine();

        System.out.print("Qual o seu nome? ");
        String nomeCliente = scanner.nextLine();
;
        System.out.print("Qual o valor do seu saldo? ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero +" e seu saldo é " + saldo + " já está disponivel para saque.");
    }}
