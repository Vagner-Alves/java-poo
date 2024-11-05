package edu.ifpe.nona.atividade.principal;

import edu.ifpe.nona.atividade.conta.*;
import edu.ifpe.nona.atividade.cliente.*;

public class MenuCaixaEletronico {

	public static void main(String[] args) {
		
		Cliente primeiroCliente = new Cliente("Vagner Alves", "xxx.xxx.xxx-xx");
		Conta primeiraConta = new Conta("1111",1180, primeiroCliente);
		
		Cliente segundoCliente = new Cliente("Larissa alves", "yyy.yyy.yyy-yy");
		Conta segundaConta = new Conta("2222", 1000, segundoCliente);
		
		primeiraConta.transferir(segundaConta, 80);
		
		System.out.println(primeiraConta.getSaldo());
		System.out.println(segundaConta.getSaldo());

	}

}
