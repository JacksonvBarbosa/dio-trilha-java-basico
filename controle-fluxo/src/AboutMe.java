import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        try {
            while(true) {
            // criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();
            
            // imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
            System.out.println("Cadastro Realizado com sucesso!");
            break;
            }
            
        } catch (java.util.InputMismatchException e) {
            System.out.println(
                    "Os campos idade/altura precisam ser númerico e não poderá usar vírgula");
            System.out.println("Realize o Cadastro Novamente!");
        }
        catch(NullPointerException e) {
            System.out.println("Campo Vazio!");
        }
        finally{
            System.out.println("Ciclo finalizado!");
        }
    }
}
