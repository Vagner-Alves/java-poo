package edu.ifpe.estudos.heranca;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente("111.222.333-99", "vagner alves");
		Conta conta =  new Conta("xxxx-xx",1180.00);
		Poupanca poupanca = new Poupanca("yyyy-yy", 2000, 0.18, cliente);
		System.out.println(poupanca);

	}

}
