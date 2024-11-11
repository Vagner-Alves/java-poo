package edu.ifpe.nona.atividade.conta;

import java.util.ArrayList;


import edu.ifpe.nona.atividade.cliente.Cliente;
public class ListaContas {
	private ArrayList<Conta> listaContas;
	private ArrayList<Poupanca> listaPoupanca;
	private ArrayList<Cliente> listaClientes;
	
	public ListaContas() {
		listaContas = new ArrayList<>();
		listaClientes = new ArrayList<>();
		listaPoupanca = new ArrayList<>();
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
		listaPoupanca.add(poupanca);
	}
	
	public Conta consultarConta(String numero) {
		for(Conta items: listaContas) {
			if(items.getNumero().equalsIgnoreCase(numero)) {
				return items;
			}
		}return null;
	}
	
	public Poupanca consultarContaPoupanca(String numero) {
		for(Poupanca items: listaPoupanca) {
			if(items.getNumero().equalsIgnoreCase(numero)) {
				return items;
			}
		}return null;
	}
	
	public Cliente consultarCliente(String nome) {
		for(Cliente items: listaClientes) {
			if(items.getNome().equalsIgnoreCase(nome)) {
				return items;
			}
		}return null;
	}
	
	public void fazerDeposito(String numero, double valor) {
		Poupanca conta = consultarContaPoupanca(numero);
		if (conta != null) {
			System.out.println("deposito realizado com sucesso!" );
			conta.depositar(valor);
		}
		else {
			Conta contaCorrente = consultarConta(numero);
			if (contaCorrente != null) {
				contaCorrente.depositar(valor);
			}
			else {
				System.out.println("conta não encontrada");
			}
		}
		//conta.depositar(valor);
		
	}
	
	public void fazerTransferencia(String contaOrigem, String contaDestino, double valorTransferencia) {
		Conta conta = consultarConta(contaOrigem);
		Conta destino = consultarConta(contaDestino);
		conta.transferir(destino, valorTransferencia);
	}

}
