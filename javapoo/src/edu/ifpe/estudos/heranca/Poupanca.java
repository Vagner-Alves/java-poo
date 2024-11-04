package edu.ifpe.estudos.heranca;

public class Poupanca {
	private String numero;
	private double saldo;
	private double juros;
	
	public Poupanca() {}
	
	public Poupanca(String n, double s, double j) {
		numero = n; saldo = s; juros=j;
	}
	
	void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	void renderJuros() {
		creditar(saldo * juros);
	}

}
