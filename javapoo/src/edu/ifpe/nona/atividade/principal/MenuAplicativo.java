package edu.ifpe.nona.atividade.principal;

import edu.ifpe.nona.atividade.conta.*;
import edu.ifpe.nona.atividade.cliente.*;

public class MenuAplicativo {

	public static void main(String[] args) {
		
		Cliente primeiroCliente = new Cliente("Vagner Alves", "xxx.xxx.xxx-xx");
		Conta conta = new Conta("1111",0, primeiroCliente);
		Poupanca contaPoupanca = new Poupanca("333", 10, primeiroCliente,1);
		
		conta.consultarSaldo();
		contaPoupanca.consultarSaldo();
		
		conta.depositar(500);
		conta.consultarSaldo();
		contaPoupanca.depositar(1000);
		contaPoupanca.consultarSaldo();
		
		contaPoupanca.renderJuros(5);
		contaPoupanca.consultarSaldo();
		conta.transferir(contaPoupanca, 200);
		conta.consultarSaldo();
		contaPoupanca.transferir(conta, 100);
		contaPoupanca.consultarSaldo();
		
	}

}
