package edu.ifpe.oitava.atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Pessoa> listadePessoas = new ArrayList<Pessoa>();
		Scanner entradaUsuario = new Scanner(System.in);

		for(int inicializador = 0; inicializador <  3 ; inicializador ++) {
			//Scanner entradaUsuario = new Scanner(System.in);
			System.out.println("\n informe o nome do da pessoa: ");
			String nome = entradaUsuario.nextLine();
			System.out.println("\n informe o cpf : ");
			String cpf = entradaUsuario.nextLine();
			System.out.println("\n informe a data de nascimento: ");
			String dataNascimento = entradaUsuario.nextLine();
			System.out.println("\n informe a altura: ");
			double altura = entradaUsuario.nextDouble();
			Pessoa pessoa = new Pessoa(nome, cpf,dataNascimento, altura);
			listadePessoas.add(pessoa);
			
		}
		
		entradaUsuario.close();
		
		for(Pessoa iterador: listadePessoas) {
			iterador.imprimirDados();
		}
	}

}
