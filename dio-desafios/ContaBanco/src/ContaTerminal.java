import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        double saldo = 2589.00;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta: ");
        int conta = entrada.nextInt();
        System.out.println("Por favor, digite o número da Agência: ");
        int agencia = entrada.nextInt();
        System.out.println("Por favor, digite seu Nome: ");
        String nome = entrada.next();

        System.out.println("Olá ".concat(nome) + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " ,conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }
}
