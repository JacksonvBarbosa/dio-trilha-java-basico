package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe os dados da conta");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();//Retira o buffer de entrada ele consome o enter do integer
		String holder = sc.nextLine();
		
		System.out.print("Saldo Inicial: ");
		double balance = sc.nextDouble();
		
		System.out.print("Limite de Saque: ");
		double withdrawLimit = sc.nextDouble();

		//Intancia da classe account com os dados lidos acima
		Account acc = new Account(number, holder, balance, withdrawLimit);
		//Busca os valores digitados do usuário diretamente
		
		System.out.println();
		System.out.println("informe uma quantia para sacar: ");
		double amount = sc.nextDouble();
		
		//modo granbiarra de fazer uma regra de negócio não usar
		//Buscando regra de negócio
		/*String error = acc.validateWithdraw(amount);
		if (error != null) {
			System.out.println(error);
		}
		else {
			//Chama a função de saque da classe account
			acc.withdraw(amount);
			//Usei um printf(print formatado) %.2f duas casas decimais %n um quebra de linha
			System.out.printf("Novo saldo:  %.2f%n", acc.getBalance());
			}*/
		
		try {
		//Chama a função de saque da classe account
		acc.withdraw(amount);
		//Usei um printf(print formatado) %.2f duas casas decimais %n um quebra de linha
		System.out.printf("Novo saldo:  %.2f%n", acc.getBalance());
		} catch(BusinessException e) {
			System.out.println(e.getMessage());//Busco a mensagem a exceção criada
		}
	 			
		
		//Fechando o Scanner
		sc.close();
	}

}
