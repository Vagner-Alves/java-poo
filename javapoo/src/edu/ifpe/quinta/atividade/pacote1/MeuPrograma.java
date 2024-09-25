package edu.ifpe.quinta.atividade.pacote1;

import edu.ifpe.quinta.atividade.pacote2.Conta;

public class MeuPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Conta conta = new Conta(); // não é possível, pois a classe conta é default e a classe MeuPrograma está em um pacote diferente.
		
		System.out.println(conta);
	//	conta.creditar();                              // esse método não é visivel , pois está privado
		double saldo1 = conta.consultarSaldo();
	//	double saldo2 = conta.saldoConta;             // o campo saldoConta não é visivel, pois está privado.
		
		String nome = conta.titular;		         // este campo está público portanto é visivel
		String numeroConta = conta.numeroConta;      // esse campo está default,portanto é visivel para classes dentro do mesmo pacote
		

	}

}
