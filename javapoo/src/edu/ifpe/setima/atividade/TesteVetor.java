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
		
		Pessoa[] listadePessoas = new Pessoa[3];
		
		Pessoa primeiraPessoa = new Pessoa();
		Pessoa segundaPessoa = new Pessoa();
		Pessoa terceiraPessoa = new Pessoa();
		
		
		listadePessoas[0] = primeiraPessoa;
		listadePessoas[1] = segundaPessoa;
		
		
		for( Pessoa lista: listadePessoas) {
			lista.imprimirDados();
			
		}
		
		
	}

}
