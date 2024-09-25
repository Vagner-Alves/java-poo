package edu.ifpe.quinta.atividade.pacote2;

import edu.ifpe.quinta.atividade.pacote1.Pessoa;

public class MeuPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta(); // é possivel pois as classes estão no mesmo pacote
		
		System.out.println(conta);
	//	conta.creditar();                              // esse método não é visivel , pois está privado
		double saldo1 = conta.consultarSaldo();
	//	double saldo2 = conta.saldoConta;             // o campo saldoConta não é visivel, pois está privado.
		
		String nome = conta.titular;		         // este campo está público portanto é visivel
		String numeroConta = conta.numeroConta;      // esse campo está default,portanto é visivel para classes dentro do mesmo pacote
		
		Pessoa primeiraPessoa = new Pessoa("Ricson",1982,1.77);
		Pessoa segundaPessoa = new Pessoa("Vagner", 1997, 1.65);
		
		System.out.println("Exibindo o maior");
		if(primeiraPessoa.getAltura() > segundaPessoa.getAltura()) {
			primeiraPessoa.imprimirDados();
		}
		
		else {
			segundaPessoa.imprimirDados();
		}
		
		System.out.println("  ");
		System.out.println("Calculando Idade e Exibindo o Mais Velho");
		
		if(primeiraPessoa.calcularIdade() > segundaPessoa.calcularIdade()) {
			primeiraPessoa.imprimirDados();
		}
		
		else{
			segundaPessoa.imprimirDados();
		}
		
	}

}
