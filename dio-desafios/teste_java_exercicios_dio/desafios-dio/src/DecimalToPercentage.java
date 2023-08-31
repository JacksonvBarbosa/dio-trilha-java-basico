import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalToPercentage {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00%"); // Formato para porcentagem
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor decimal (0.01 para 1%): ");
        double valorDecimal = scanner.nextDouble();

        double valorPorcentagem = valorDecimal * 100; // Converter para porcentagem
        String valorPorcentagemFormatado = df.format(valorPorcentagem);

        System.out.println("Valor como porcentagem: " + valorPorcentagemFormatado);

        scanner.close();
    }
}