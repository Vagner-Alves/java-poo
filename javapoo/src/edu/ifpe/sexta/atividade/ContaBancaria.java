package edu.ifpe.sexta.atividade;

public class ContaBancaria {
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	public ContaBancaria(String nomeCliente, int numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if ( valor > saldo) {
			System.out.println("Saldo Insuficiente!!!");
		}
		
		else {
			
			System.out.println("Valor do Saque: R$ " + valor );
			saldo = saldo - valor;
		}
		
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("O valor da conta R$: " + saldo);
	}
	
	public void calcularNovoSaldo(double percentualRendimento) {
		double rendimento = saldo *= ( percentualRendimento / 100 );
		saldo += rendimento;
		System.out.println("O valor dos rendimentos R$: " + rendimento);
		System.out.println("O valor total do Saldo R$: " + saldo);
	}
}
