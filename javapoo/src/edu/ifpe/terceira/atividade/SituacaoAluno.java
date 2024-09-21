package edu.ifpe.terceira.atividade;

import java.util.Scanner;

public class SituacaoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado  = new Scanner(System.in);
		System.out.println("Informe o Nome do Aluno: ");
		String nomeAluno = teclado.nextLine();
		
		
		System.out.println("Informe a primeira Nota: ");
		double primeiraNota = teclado.nextDouble();
		System.out.println("Informe a primeira Nota: ");
		double segundaNota  = teclado.nextDouble();
		
		double mediadasNotas = (primeiraNota + segundaNota) / 2;
		
		if(mediadasNotas >= 7) {
			System.out.println(" Aprovado ");
		}
		
		else if (mediadasNotas < 4) {
			System.out.println("Reprovado");
		}
		
		else if (mediadasNotas >=4 && mediadasNotas < 7){
			System.out.println("Prova Final");
		}

	}

}
