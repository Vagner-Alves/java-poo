package edu.ifpe.setima.atividade;

import java.util.Scanner;

public class TesteVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nomes = new String[3];
		Scanner teclado = new Scanner(System.in);
		int condicao = 1;
		
		nomes[0] = "João";
		nomes[1] = "Maria";
		nomes[2] = "José";
		
		for(String lista: nomes) {
			System.out.println(lista);
		}
		
		System.out.println(" ");
		
		//Pessoa[] listadePessoas = new Pessoa[3];
		
		Pessoa primeiraPessoa = new Pessoa("vagner alves","xxx.xxx.xxx-xx","05/01/1997", 1.65);
		Pessoa segundaPessoa = new Pessoa("fulano de tal", "xxx.xxx.xxx-yy","08/04/1996", 1.70);
		Pessoa terceiraPessoa = new Pessoa("moça aleatória", "yyy.yyy.yyy-xx","08/18/2004", 1.63);
		
		Pessoa[] listadePessoas = {primeiraPessoa, segundaPessoa, terceiraPessoa};
		
		for( Pessoa lista: listadePessoas) {
			lista.imprimirDados();
			
		}
		
		
	}

}
