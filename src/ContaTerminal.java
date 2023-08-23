import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int num;
        String numAgencia, nomeCliente;
        double sal;

        System.out.println("Por favor, digite o número da agência:");
        num = read.nextInt();
        read.nextLine();

        System.out.println("Por favor, digite a agência:");
        numAgencia = read.nextLine();

        System.out.println("Por favor, digite seu nome:");
        nomeCliente = read.nextLine();

        System.out.println("Por favor, digite seu saldo:");
        sal = read.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + ", conta " + num + " e seu saldo de R$:" + sal + "já está disponível para saque.");

    }
}
