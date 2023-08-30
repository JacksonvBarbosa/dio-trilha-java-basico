import java.util.Scanner;

public class FormatadorCepExemplo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu CEP: ");
        String cep = entrada.nextLine();

        try {
            String cepFormatado = formatarCep(cep);
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("CEP Invalido");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        // simulando um cep formatado
        return cep;
    }
}
