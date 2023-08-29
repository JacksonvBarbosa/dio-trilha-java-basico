public class ExemploBreakContinue {

    public static void main(String[] args) {

        for (int numero = 1; numero <= 50; numero++) {
            if (numero % 2 == 0)
                continue;

            if (numero >= 29 && numero <= 43)
                continue;

            System.out.println(numero);

        }
        // Qual a saída no console ?
    }
}
