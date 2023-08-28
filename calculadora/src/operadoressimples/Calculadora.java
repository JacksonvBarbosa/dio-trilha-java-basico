package operadoressimples;

import java.util.Scanner;

/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros e reais
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author Jackson Ventura
 * @version 1.0
 * @since 08/08/2023
 */

public class Calculadora {

    public double numero1 = 0;
    public double numero2 = 0;
    public double resultado = 0;

    /**
     * Este método é utilizado para somar dois números inteiros ou reais
     * 
     * @param numero1 este é o primeiro parâmetro do método
     * @param numero2 este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     * @param Scanner este está sendo usado para entrada dos numeros pelo usuário
     */
    public void somar(double numero1, double numero2) {
        System.out.println("Vamos Somar!");
        Scanner operador = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        numero1 = operador.nextDouble();
        System.out.println("Digite o Segundo número: ");
        numero2 = operador.nextDouble();
        resultado = numero1 + numero2;
        System.out.println(resultado);
    }

    
    /** 
     * @param numero1
     * @param numero2
     */
    public void subtrair(double numero1, double numero2) {
        System.out.println("Vamos Subtrair!");
        Scanner operador = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        numero1 = operador.nextDouble();
        System.out.println("Digite o Segundo número: ");
        numero2 = operador.nextDouble();
        resultado = numero1 - numero2;
        System.out.println(resultado);
    }

    public void multiplicar(double numero1, double numero2) {
        System.out.println("Vamos Multiplicar!");
        Scanner operador = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        numero1 = operador.nextDouble();
        System.out.println("Digite o Segundo número: ");
        numero2 = operador.nextDouble();
        resultado = numero1 * numero2;
        System.out.println(resultado);
    }

    public void dividir(double numero1, double numero2) {
        System.out.println("Vamos Dividir!");
        Scanner operador = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        numero1 = operador.nextDouble();
        System.out.println("Digite o Segundo número: ");
        numero2 = operador.nextDouble();
        resultado = numero1 / numero2;
        System.out.println(resultado);
    }

}
