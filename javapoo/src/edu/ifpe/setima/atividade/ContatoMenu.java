package edu.ifpe.setima.atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class ContatoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		ArrayList<Contato> agenda = new ArrayList<Contato>();
		int condicao = 1;

		String menu = "Opção " + " Ação " + "\n " + "1  adicionar" + "\n " + "2  consultar" + "\n "
				+ "3  alterar" + "\n " + "4  excluir contato";



		while(condicao != 0) {
			System.out.println(menu);
			int escolhaUsuario = teclado.nextInt();

			if (escolhaUsuario == 0) {
				break;
			}
			else if (escolhaUsuario == 1) {

			}
			else if (escolhaUsuario == 2) {

			}
			else if (escolhaUsuario == 3) {

			}
			else if (escolhaUsuario == 4) {

			}

		}
		System.out.println("Obrigado por usar o sistema.");
	}

}
