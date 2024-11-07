package edu.ifpe.nona.atividade.principal;

import java.util.Scanner;

import edu.ifpe.nona.atividade.cliente.Cliente;
import edu.ifpe.nona.atividade.conta.Conta;
import edu.ifpe.nona.atividade.conta.ListaContas;
import edu.ifpe.nona.atividade.conta.Poupanca;

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
				System.out.println("informe o nome do cliente: ");
				String nome = teclado.nextLine();
				System.out.println("informe o cpf do cliente: ");
				String cpf = teclado.nextLine();
				contas.adicionarCliente(nome, cpf);
				//contas.consultarConta("vagner alves");
				break;
				
			case 2:
				System.out.println("informe o número da conta: ");
				String numeroConta = teclado.nextLine();
				System.out.println("informe o saldo da conta: ");
				double saldoConta = teclado.nextDouble();
				contas.adicionarConta(numeroConta, saldoConta, null);
				break;
			
			case 3:
				System.out.println("Informe o número da conta (poupanca): "); 
				String numeroContaPoupanca = teclado.nextLine(); 
				System.out.println("Informe o saldo da conta (poupanca): ");
				double saldoContaPoupanca = teclado.nextDouble(); 
				teclado.nextLine(); 
				System.out.println("Informe o nome do cliente: ");
				String nomeClientePoupanca = teclado.nextLine();
				Cliente clientePoupanca = contas.consultarConta(nomeClientePoupanca).getCliente();
				System.out.println("Taxa de juros: ");
				double juros = teclado.nextDouble(); 
				teclado.nextLine();  
				contas.adicionarContaPoupanca(numeroContaPoupanca, saldoContaPoupanca, clientePoupanca, juros); 
				System.out.println("Poupança criada com sucesso!");
				break;
			
			case 4:
				System.out.println("informe o valor a ser depositado: ");
				double valor = teclado.nextDouble();
				System.out.println("informa o titular da conta (nome): ");
				String nomeTitular = teclado.nextLine();
				contas.fazerDeposito(nomeTitular, valor);
				break;
				
			
			case 5:
				System.out.println("informe o titular da conta (nome): ");
				String consulta = teclado.nextLine();
				contas.consultarConta(consulta);
				break;
			
			case 6:
				System.out.println("informe o valor a ser transferido: ");
				double valorTransferencia = teclado.nextDouble();
				System.out.println("informe o titular da conta: ");
				String contaOrigem = teclado.nextLine();
				System.out.println("informe a conta de destino: ");
				String contaDestino = teclado.nextLine();
				contas.fazerTransferencia(contaOrigem, contaDestino, valorTransferencia);
				break;
			
			case 7:
				System.out.println("Informe o nome do cliente: "); 
				String nomeJuros = teclado.nextLine(); 
				Conta contaJuros = contas.consultarConta(nomeJuros); 
				if (contaJuros instanceof Poupanca) { ((Poupanca) contaJuros).renderJuros(5); 
				System.out.println("Juros rendidos com sucesso!"); }
				else { System.out.println("Esta conta não é uma poupança."); }
				
			case 8:
				System.out.println("obrigado por usar o sistema: ");
				break;
			
			default:
				System.out.println("opção invalida , tente novamente.");
				break;
				
				
			}
			
		}
		
	
	}

}
