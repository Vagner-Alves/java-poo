package edu.ifpe.sexta.atividade;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria primeiraConta = new ContaBancaria("Vagner Alves",111111,1500);
		ContaBancaria segundaConta = new ContaBancaria("Maria alguma coisa", 22222, 1800);
		
		primeiraConta.sacar(1501);
		primeiraConta.sacar(100);
		primeiraConta.depositar(100);
		primeiraConta.calcularNovoSaldo(4.35);
		System.out.println(" ");
		segundaConta.sacar(1801);
		segundaConta.sacar(100);
		segundaConta.depositar(2000);
		segundaConta.calcularNovoSaldo(4.35);
		System.out.println(" ");
		primeiraConta.exibirDados();
		System.out.println(" ");
		segundaConta.exibirDados();
	}

}
