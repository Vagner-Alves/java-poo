package edu.ifpe.nona.atividade.conta;

import edu.ifpe.nona.atividade.cliente.Cliente;

public class Conta {
	private String numero;
	private double saldo;
	Cliente cliente;
	
	public Conta() {}
	
	public Conta(String numero, double saldo, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
		
	}
	
	public void consultarSaldo() {
		System.out.println("Exibindo extrato da conta: ");
		System.out.println("R$: " + this.saldo);
	}
	
	public void depositar(double valor) {
		double novoSaldo = saldo + valor;
		this.saldo = novoSaldo;
	}
	
	public void transferir(double valor) {}
	
	public String getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}