package edu.ifpe.segunda.atividade;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso1 = 4;
		double peso2 = 6;
		double calcularMedia = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do Aluno(a): ");
		String nome = teclado.nextLine();
		
		System.out.println("Informe a nota do primeiro Bimestre: ");
		double primeiraNota = teclado.nextDouble();
		
		System.out.println("Informe a nota do segundo Bimestre: ");
		double segundaNota  = teclado.nextDouble();
		
		teclado.close();
		
		calcularMedia = ((primeiraNota * peso1) + (segundaNota * peso2)) / (peso1 + peso2);
		
		System.out.println("O aluno: " + nome + "Tem uma Média de: " + calcularMedia);
		

	}

}
