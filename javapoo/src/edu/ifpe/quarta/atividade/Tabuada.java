package edu.ifpe.quarta.atividade;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("DIGITE UM NÚMERO PARA VER SUA TABUADA: ");
		int numeroTabuada = teclado.nextInt();
		
		for(int inicio = 1; inicio <= 10; inicio ++) {
			System.out.println(inicio + " x " + numeroTabuada + " = " + inicio * numeroTabuada);
		}

	}

}
