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
	
	public Conta consultarConta(String nome) {
		for(Conta items: listaContas) {
			if(items.cliente.getNome().equalsIgnoreCase(nome)) {
				return items;
			}
		} return null;
	}
	
	public void fazerDeposito(String nome) {
		Conta conta = consultarConta(nome);
		
		
	}
	
	public void fazerTransferencia(String nome) {
		Conta conta = consultarConta(nome);
	}

}
