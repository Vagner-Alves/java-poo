package edu.ifpe.setima.atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class ContatoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		ArrayList<Contato> agenda = new ArrayList<Contato>();
		
		String menu = "Opção " + " Ação " + "\n " + "1  adicionar" + "\n " + "2  consultar" + "\n "
		+ "3  alterar" + "\n " + "4  excluir contato";
		
		System.out.println(menu);
		
		
	}

}
