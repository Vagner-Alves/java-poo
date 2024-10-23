package edu.ifpe.nona.atividade.conta;

import edu.ifpe.nona.atividade.cliente.Cliente;

public class Poupanca extends Conta{
	private double juros;
	
	public Poupanca(String numero, double saldo, Cliente cliente, double juros) {
		super(numero, saldo, cliente);
		this.juros = juros;
	}
	
	public double getJuros() {
		return juros;
	}
	
	public void setJuros(double juros) {
		this.juros = juros;
	}
}
