import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;
public class BancoApp {
        public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");
        Locale.setDefault(Locale.US);//Classe de definição em inglês do ponto das casas decimais
        Scanner scanner = new Scanner(System.in);

        try { 
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        double valorFinal = valorInicial;
        
        valorFinal = ValorFinalInvestimento(valorInicial, taxaJuros, periodo);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
        }
        catch(InputMismatchException e) {
            System.out.println("ERRO! POR FAVOR DIGITE PONTO(.) VIRGULA NÃO É ACEITA!");
        }
    }

    static double ValorFinalInvestimento(double valorInicial, double taxaJuros, int periodo) {
        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);
        return valorFinal;
    }
}
