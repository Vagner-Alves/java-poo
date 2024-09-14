package edu.ifpe.primeira.atividade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente primeiraConta = new ContaCorrente("118","1818-8",8000);
		ContaCorrente segundaConta  = new ContaCorrente("444","2378-9", 2400);
		
		System.out.println("Saldo da Primeira Conta: " + primeiraConta.saldo);
		System.out.println("Saldo da Segunda Conta: " + segundaConta.saldo);
		
		

	}

}
