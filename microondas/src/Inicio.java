import java.util.Scanner;

import principal.MicroOndas;

public class Inicio {

    public static void main(String[] args) {

        // variaveis
        String res = "";
        int res1 = 0;

        MicroOndas operacao = new MicroOndas();

        Scanner inicio = new Scanner(System.in);

        System.out.println("""
                Selecione Função:
                1 - Pipoca
                2 - Arroz
                3 - Frango
                4 - Descongelar
                5 - SAIR
                """);

        System.out.println("Escolha Sua Opção: ");
        res1 = inicio.nextInt();

            if (res1 == 1) {
                System.out.println("Começar? S/N");
                res = inicio.next();
                if (res.equals("S")) {
                    operacao.incia = true;
                    operacao.prepararPipoca();
                    System.out.println("Função Pipopa: " + operacao.tempo);
                    System.out.println("Funcionamento");
                } else {
                    System.out.println("Tempo inicial: " + operacao.tempo);
                    System.out.println("Clique em Start");
                }

            if (res1 == 2) {
                System.out.println("Começar? S/N");
                res = inicio.next();
                if (res.equals("S")) {
                    operacao.incia = true;
                    operacao.prepararArroz();
                    System.out.println("Função Arroz: " + operacao.tempo);
                    System.out.println("Funcionamento");
                } else {
                    System.out.println("Tempo inicial: " + operacao.tempo);
                    System.out.println("Clique em Start");
                }

                if (res1 == 3) {
                    System.out.println("Começar? S/N");
                    res = inicio.next();
                    if (res.equals("S")) {
                        operacao.incia = true;
                        operacao.prepararFrango();
                        System.out.println("Função Frango: " + operacao.tempo);
                        System.out.println("Funcionamento");
                    } else {
                        System.out.println("Tempo inicial: " + operacao.tempo);
                        System.out.println("Clique em Start");
                    }

                    if (res1 == 4) {
                        System.out.println("Começar? S/N");
                        res = inicio.next();
                        if (res.equals("S")) {
                            operacao.incia = true;
                            operacao.descongelar();
                            System.out.println("Função Descongelar: " + operacao.tempo);
                            System.out.println("Funcionamento");
                        } else {
                            System.out.println("Tempo inicial: " + operacao.tempo);
                            System.out.println("Clique em Start");
                        }

                        if (res1 == 5) {
                            System.out.println("Sair Selecionado");
                        }
                    }
                }
            }
        }
    }
}