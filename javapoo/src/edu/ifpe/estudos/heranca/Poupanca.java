package edu.ifpe.estudos.heranca;

public class Poupanca extends Conta{
	private double juros;
	private Cliente cliente;
	
	public Poupanca(String n, double s, double j, Cliente c) {
		super(n,s);
		this.juros=j;
		this.cliente = c;
	}
	
	void creditar(double valor) {
		double saldo = this.getSaldo();
		saldo = saldo + valor;
		
	}
	
	void renderJuros() {
		double saldo = this.getSaldo();
		this.creditar( saldo * juros);
		 
	}
	public double getJuros() {
		return juros;
	}
	public void setJuros(double valor) {
		this.juros = valor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente c) {
		this.cliente = c;
	}

}
