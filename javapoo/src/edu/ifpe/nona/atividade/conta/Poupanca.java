package edu.ifpe.nona.atividade.conta;

import edu.ifpe.nona.atividade.cliente.Cliente;

public class Poupanca extends Conta{
	private double juros;
	
	public Poupanca() {
		super();
	}
	public Poupanca(String numero, double saldo, Cliente cliente, double juros) {
		super(numero, saldo, cliente);
		this.juros = juros;
	}
	
	public void renderJuros(double valor) {
		double valorJuros = getSaldo() * ( valor / 100);
		this.setSaldo(getSaldo() + valorJuros );
		
	}
	public double getJuros() {
		return juros;
	}
	
	public void setJuros(double juros) {
		this.juros = juros;
	}
}
