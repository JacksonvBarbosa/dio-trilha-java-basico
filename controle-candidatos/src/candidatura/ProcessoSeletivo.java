package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		System.out.println("Processo Seletivo");
		//selecaoCandidatos();
		imprimirSelecinados();
		
	}
	
	//Métodos
	
	//Case 3 Imprimir Selecionados
	static void imprimirSelecinados() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		
		for(int indice=0; indice < candidatos.length; indice++) {
			System.out.printf("O candidato de nº %d é %s%n", indice + 1, candidatos[indice]);
		}
		
		System.out.println("\nForma abreviada de interação (for each)\n");
		
		for(String candidato: candidatos) {
			System.out.printf("O candidato selecionado foi %s%n", candidato);
		}
	}
	
	static void selecaoCandidatos() {
		// Array com a lista de candidatos
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
	
		//Variavies auxiliares do while case 2
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.00;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.printf("O candidato %s Solicitou este valor de salário %.2f%n", candidato, salarioPretendido);
		
			if(salarioBase >= salarioPretendido) {
				System.out.printf("O candidato %s foi selecionado para a vaga %n%n", candidato);
				candidatosSelecionados++;
			} else {
				System.out.printf("Infelizmente, O candidato %s não foi selecionado para a vaga %n%n", candidato);
			}
			candidatoAtual++;
		}
	}
	
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	//Função não utilizada no momento 30/08/23 10:08 case 1
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.00;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
