package Principal;

import java.util.Scanner;

import Excecoes.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {

		System.out.println("Olá Seja Bem vindo(a) ao nosso Sistema de Impressão!.\n");

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = sc.nextInt();
		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(e.getMessage());// Busco a mensagem a exceção criada
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("ERRO: O SEGUNDO PARÂMETRO DEVE SER MAIOR QUE O PRIMEIRO");
		}
		int contagem = parametroDois - parametroUm;
		System.out.printf("""
				%nVocê digitou %d como 1º parametro e %d como 2º parametro.
				Os números impressos serão a subtração desses dois números.
				O resultado foi %d.%n
				Imprimindo... %n
				""", parametroUm, parametroDois, contagem);
		// realizar o for para imprimir os números com base na variável contagem
		for (int contador = 1; contador <= contagem; contador++) {
			System.out.printf("Imprissão número %d%n", contador);

		}
	}
}
