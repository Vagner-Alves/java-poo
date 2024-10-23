package edu.ifpe.oitava.atividade;

import java.util.Scanner;

import edu.ifpe.setima.atividade.Contato;

public class AgendaMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agendaContatos = new Agenda();
		Scanner teclado = new Scanner(System.in);
		
		String menuOpcoes = "\n AGENDA DE CONTATOS " + "\n" + "1 adicionar contato" 
				+ "\n" + "2 consultar" + "\n" +  "3 alterar contato" + "\n" + "4 excluir contato" + "\n" + "5 sair";
		
		while(true) {
			System.out.println(menuOpcoes);

			System.out.println("Escolha uma opção: ");
			int opcao = teclado.nextInt();
			teclado.nextLine();

			switch(opcao) {

			case 1:
				System.out.println("informe o nome: ");
				String nome = teclado.nextLine();
				System.out.println("informe o número de telefone: ");
				String telefone = teclado.nextLine();
				agendaContatos.adicionarContato(nome, telefone);
				break;

			case 2:
				System.out.println("informe o nome do contato que deseja pesquisar: ");
				nome  = teclado.nextLine();
				Contato contato = agendaContatos.consultarContato(nome);
				System.out.println("Nome: " + contato.getNome() + " telefone " + contato.getTelefone() );

			case 3:
				System.out.println("informe o nome do contato que deseja alterar: ");
				nome  = teclado.nextLine();
				System.out.println("informe o novo número de telefone: ");
				String novoNumero = teclado.nextLine();
				agendaContatos.alterarContato(nome, novoNumero);
				break;
			
			case 4:
				System.out.println("informe o nome do contato que deseja excluir: ");
				nome  = teclado.nextLine();
				agendaContatos.excluirContato(nome);
				break;
			
			case 5:
				System.out.println("saindo da lista de contatos: ");
				teclado.close();
				return;
				
			default:
				System.out.println("não existe a opção de número: " + opcao);
			}
		}

	}

}
