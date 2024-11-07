package edu.ifpe.nona.atividade.principal;

import java.util.Scanner;

import edu.ifpe.nona.atividade.conta.ListaContas;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaContas contas = new ListaContas();
		Scanner teclado = new Scanner(System.in);
		
		String menuOpcoes = "\n MENU DO BANCO " + "\n" + "1 Criar Cliente" 
				+ "\n" + "2 Criar Conta" 
				+ "\n" +  "3 Criar Poupança" + 
				"\n" + "4 Depositar" + "\n" + "5 Consultar Saldo"
				+ "\n" + "6 Transferir Dinheiro" + "\n" + "7 Render Juros" + "\n" + "8 Sair";
		
		while(true) {
			System.out.println(menuOpcoes);
			System.out.println("Escolha uma opção: ");
			int opcao = teclado.nextInt();
			teclado.nextLine();
			
			switch(opcao) {
				
			case 1:
				
				
			}
		}
		
	}

}
