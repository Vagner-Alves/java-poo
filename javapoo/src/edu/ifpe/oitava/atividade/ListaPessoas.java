package edu.ifpe.oitava.atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Pessoa> listadePessoas = new ArrayList<Pessoa>();
		Scanner entradaUsuario = new Scanner(System.in);

		System.out.println("informe o nome do da pessoa: ");
		String nome = entradaUsuario.nextLine();
		System.out.println("informe o cpf : ");
		String cpf = entradaUsuario.nextLine();
		System.out.println("informe a data de nascimento: ");
		String dataNascimento = entradaUsuario.nextLine();
		System.out.println("informe a altura: ");
		double altura = entradaUsuario.nextDouble();

		Pessoa pessoa = new Pessoa(nome, cpf,dataNascimento, altura);

		

		for(int inicializador = 0; inicializador <  3; inicializador ++) {}

		
	}

}
