package edu.ifpe.terceira.atividade;

import java.util.Scanner;

public class CaixaMercado_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int condicao = 1;
		int quantidadeItens = 0;
		double valorTotal = 0;
		double codigo1 = 0;
		double codigo2 = 0; 
		double codigo3 = 0; 
		double codigo5 = 0; 
		double codigo9 = 0;
		
		String produtos = "código " + " produto " + "\n " + "1      0,50"
				+ "\n " + "2      1,00" + "\n " + "3      4,00"  + "\n " + "5      7,00" + "\n " + "9      8,00";
		
		do {
			 System.out.println(produtos);
			 int escolhaUsuario = teclado.nextInt();
			 
			 if (escolhaUsuario == 0) {
				 break;
			 }
			 
			 else if (escolhaUsuario == 4 || escolhaUsuario > 5) {
				 System.out.println("código inválido");
				 System.out.println(" ");
				 
			 }
			
			 else if (escolhaUsuario == 1) {
				 System.out.println("informe a quantidade de items que deseja: ");
				 quantidadeItens = teclado.nextInt();
				 codigo1 =  quantidadeItens * 0.50;
				 
			 }
			 
			 else if (escolhaUsuario == 2) {
				 System.out.println("informe a quantidade de items que deseja: ");
				 quantidadeItens = teclado.nextInt();
				 codigo2 =  quantidadeItens * 1.00;
				 
			 }
			 
			 else if (escolhaUsuario == 3) {
				 System.out.println("informe a quantidade de items que deseja: ");
				 quantidadeItens = teclado.nextInt();
				 codigo3 =  quantidadeItens * 4.00;
				 
			 }
			 
			 else if (escolhaUsuario == 5) {
				 System.out.println("informe a quantidade de items que deseja: ");
				 quantidadeItens = teclado.nextInt();
				 codigo5 =  quantidadeItens * 7.00;
				 
			 }
			 
			 else if (escolhaUsuario == 9) {
				 System.out.println("informe a quantidade de items que deseja: ");
				 quantidadeItens = teclado.nextInt();
				 codigo9 =  quantidadeItens * 8.00;
				 
			 }
			 valorTotal =  codigo1 + codigo2 + codigo3 + codigo5 + codigo9 ;
		}
		
		while(condicao != 0);
		System.out.println("Valor total dos itens " + valorTotal);
		teclado.close();

	}

}
