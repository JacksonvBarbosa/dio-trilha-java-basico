import java.util.Scanner;
import java.util.NoSuchElementException;

public class Depositar {
    public static void main(String[] args) {

        // Variaveis
        double saldo = 0.0;
        Scanner scanner = new Scanner(System.in);
        try {
            do {
                System.out.println("Digite o valor a depositar: ");
                double valor = scanner.nextDouble();

                if (valor > 0) {
                    // TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide
                    // Exemplos).
                    saldo += valor;
                    System.out.println("Deposito realizado com sucesso!");
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                } else if (valor == 0) {
                    // TODO: Imprimir a mensagem de valor inválido.
                    System.out.println("Encerrando o programa...");
                    break;
                } else {
                    // TODO: Imprimir a mensagem de encerrar o programa.
                    System.out.println("Valor invalido! Digite um valor maior que zero.");
                }
            } while (true);
        } catch (NoSuchElementException e) {

        }
    }
}
