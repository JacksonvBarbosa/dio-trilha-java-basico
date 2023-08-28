import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Variavel
        double saldo = 2589.00;
        
        //Instanciando a Classe Scanner
        Scanner entrada = new Scanner(System.in);

        //Entrada de dados do usuário
        System.out.println("Por favor, digite o número da Conta: ");
        int conta = entrada.nextInt();
        System.out.println("Por favor, digite o número da Agência: ");
        int agencia = entrada.nextInt();
        System.out.println("Por favor, digite seu Nome: ");
        String nome = entrada.next();

        //Saída de dados para o usuário
        System.out.println("Olá ".concat(nome) + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " ,conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }
}
