package edu.ifpe.terceira.atividade;

import java.util.Scanner;

public class CaixaMercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int condicao = 1;
		double quantidadeItens = 0;
		
		String produtos = "código " + " produto " + "\n " + "1      0,50"
		+ "\n " + "2      1,00" + "\n " + "3      4,00"  + "\n " + "5      7,00" + "\n " + "9      8,00";
		
		//System.out.println(produtos);
		
		while (condicao != 0) {
			 System.out.println(produtos);
			 int escolhaUsuario = teclado.nextInt();
			 
			 if (escolhaUsuario == 0) {
				 break;
			 }
			 
			 else if (escolhaUsuario == 1) {
				 
			 }
		}
		
		System.out.println("Laço parado");
		teclado.close();

	}

}
