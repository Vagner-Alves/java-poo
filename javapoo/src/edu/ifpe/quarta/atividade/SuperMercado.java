package edu.ifpe.quarta.atividade;

import java.util.Scanner;

public class SuperMercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Tabela de preços dos itens
        double[] precos = {0.0, 2.5, 3.0, 4.0, 5.0}; 

        System.out.print("Quantos itens você vai comprar? ");
        int quantidadeItens = scanner.nextInt();
        double total = 0.0;

        for (int i = 0; i < quantidadeItens; i++) {
            System.out.print("Informe o código do item (1-4): ");
            int codigo = scanner.nextInt();
            System.out.print("Informe a quantidade do item: ");
            int quantidade = scanner.nextInt();

            if (codigo >= 1 && codigo <= 4) {
                total += precos[codigo] * quantidade;
            } else {
                System.out.println("Código inválido");
            }
        }

        System.out.printf("O total a pagar é: R$ %.2f%n", total);
        scanner.close();
    }

	}


