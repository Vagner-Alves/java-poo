package edu.ifpe.setima.atividade;

public class TesteVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nomes = new String[3];
		
		nomes[0] = "João";
		nomes[1] = "Maria";
		nomes[2] = "José";
		
		for(String lista: nomes) {
			System.out.println(lista);
		}
		
		System.out.println(" ");
		
		Pessoa[] listadePessoas = new Pessoa[2];
		
		Pessoa primeiraPessoa = new Pessoa("Vagner Alves","xxx.xxx.xxx-xx","05/01/1997", 1.65);
		Pessoa segundaPessoa = new Pessoa("Larissa","xxx.xxx.xxx-yy","05/01/1996", 1.70);
		
		listadePessoas[0] = primeiraPessoa;
		listadePessoas[1] = segundaPessoa;
		
		
		for( Pessoa lista: listadePessoas) {
			lista.imprimirDados();
		}
		
	}

}
