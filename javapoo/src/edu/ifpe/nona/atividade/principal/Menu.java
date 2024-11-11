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
				contas.adicionarConta(numeroConta, saldoConta,null);
				break;

			case 3:
				System.out.println("Informe o número da conta (poupanca): "); 
				String numeroContaPoupanca = teclado.nextLine(); 
				System.out.println("Informe o saldo da conta (poupanca): ");
				double saldoContaPoupanca = teclado.nextDouble(); 
				teclado.nextLine(); 
				System.out.println("Taxa de juros: ");
				double juros = teclado.nextDouble(); 
				teclado.nextLine();  
				contas.adicionarContaPoupanca(numeroContaPoupanca, saldoContaPoupanca, null, juros); 
				System.out.println("Poupança criada com sucesso!");
				break;

			case 4:
				System.out.println("informe o valor a ser depositado: ");
				double valor = teclado.nextDouble();
				teclado.nextLine();
				System.out.println("informa o número da conta: ");
				String numConta = teclado.nextLine();
				contas.fazerDeposito(numConta, valor);
				break;


			case 5:
				System.out.println("informe o número da conta: ");
				String consulta = teclado.nextLine();
				Conta pesquisa = contas.consultarConta(consulta);

				Poupanca contaPoupanca = contas.consultarContaPoupanca(consulta);

				if (contaPoupanca != null) {
					System.out.println("Essa conta é do tipo Poupança.");
					System.out.println("Saldo da conta: " + contaPoupanca.getSaldo());
					System.out.println("Juros da poupança: " + contaPoupanca.getJuros());
				} else {
					
					Conta contaCorrente = contas.consultarConta(consulta);

					if (contaCorrente != null) {
						System.out.println("Essa conta é do tipo Conta Corrente.");
						System.out.println("Saldo da conta: " + contaCorrente.getSaldo());
					} else {
						System.out.println("Conta não encontrada.");
					}
				}
					break;

				case 6:
					System.out.println("informe o valor a ser transferido: ");
					double valorTransferencia = teclado.nextDouble();
					System.out.println("informe o titular da conta: ");
					String contaOrigem = teclado.nextLine();
					teclado.nextLine();
					System.out.println("informe a conta de destino: ");
					String contaDestino = teclado.nextLine();
					contas.fazerTransferencia(contaOrigem, contaDestino, valorTransferencia);
					break;

				case 7:
					System.out.println("Informe o número da conta: "); 
					String numeroPoupanca = teclado.nextLine();
					Poupanca contaPoupancaP = contas.consultarContaPoupanca(numeroPoupanca);
					System.out.println("Juros rendidos com sucesso!" + contaPoupancaP.getJuros()); 


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
