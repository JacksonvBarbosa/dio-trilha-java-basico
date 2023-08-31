import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;
public class BancoApp {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");
        Locale = new Locale( "US");
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();

        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        double valorFinal = valorInicial;

        valorFinal = ValorFinalInvestimento(valorInicial, taxaJuros, periodo);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }

    static double ValorFinalInvestimento(double valorInicial, double taxaJuros, int periodo) {
        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);
        return valorFinal;
    }
}
