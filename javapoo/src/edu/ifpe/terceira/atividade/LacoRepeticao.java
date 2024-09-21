package edu.ifpe.terceira.atividade;

import java.util.Scanner;

public class LacoRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		int somaNumeros = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Digite um Número: ");
			int numeros = teclado.nextInt();
			contador += 1;
			somaNumeros += numeros;
		}
		while (contador <= 4);
		teclado.close();
		
		System.out.println(somaNumeros);
		System.out.println(somaNumeros / 5);

	}

}
