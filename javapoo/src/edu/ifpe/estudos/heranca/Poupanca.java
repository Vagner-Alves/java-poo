package edu.ifpe.estudos.heranca;

public class Poupanca extends Conta{
	private double juros;
	
	public Poupanca(String n, double s, double j) {
		super(n,s);
		this.juros=j;
	}
	
	void creditar(double valor) {
		double saldo = this.getSaldo();
		saldo = saldo + valor;
		
	}
	
	void renderJuros() {
		double saldo = this.getSaldo();
		 
	}

}
