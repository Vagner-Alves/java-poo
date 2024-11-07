package edu.ifpe.nona.atividade.conta;

import java.util.ArrayList;


import edu.ifpe.nona.atividade.cliente.Cliente;
public class ListaContas {
	private ArrayList<Conta> listaContas;
	private ArrayList<Cliente> listaClientes;
	
	public ListaContas() {
		listaContas = new ArrayList<>();
		listaClientes = new ArrayList<>();
	}
	
	public void adicionarCliente(String nome, String cpf) {
		Cliente cliente = new Cliente(nome, cpf);
		listaClientes.add(cliente);
	}
	
	public void adicionarConta(String numero, double saldo, Cliente cliente) {
		Conta conta = new Conta(numero, saldo, cliente);
		listaContas.add(conta);	
	}
	
	public void adicionarContaPoupanca(String numero, double saldo, Cliente cliente, double j) {
		Poupanca poupanca = new Poupanca(numero, saldo, cliente, j);
		listaContas.add(poupanca);
	}
	
	public Conta consultarConta(String nome) {
		for(Conta items: listaContas) {
			if(items.cliente.getNome().equalsIgnoreCase(nome)) {
				return items;
			}
		} return null;
	}
	
	public void fazerDeposito(String nome, double valor) {
		Conta conta = consultarConta(nome);
		conta.depositar(valor);
		
	}
	
	public void fazerTransferencia(String nome, String contaDestino, double valor) {
		Conta conta = consultarConta(nome);
		Conta destino = consultarConta(contaDestino);
		conta.transferir(destino, valor);
	}

}
