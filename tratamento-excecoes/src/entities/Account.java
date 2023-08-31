package entities;

import exceptions.BusinessException;

public class Account {
	
	//Variaveis da Classe
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	//Construtor padrão sem parametros
	public Account () {
	}

	//Construtor padrão com todos os parametros
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	//Métodos
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		validateWithdraw(amount);//Chama Regra de negócio
		balance -= amount;
	}
	
	//Regra de Negocio delegado no lugar certo
	private void validateWithdraw(double amount) {
		//Condicionais de direção
		if (amount > getWithdrawLimit()) {
			throw new BusinessException("Erro de saque: A quantia excede o limite de saque!");
		} 
		if (amount > getBalance()) {
			throw new BusinessException ("Erro de saque: Saldo Insulficiente");
		}
	}

}
	
