package edu.ifpe.primeira.atividade;

public class Pessoa {
	public String nome;
	public String dataNascimento;
	public String cpf;
	
	public Pessoa(String nome,  String dataNascimento,String cpf) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}
	
	public void acordar() {
		System.out.println("Acordar");
	}
	
	public void comer() {
		System.out.println("Comer");
	}
	
	public void dormir() {
		System.out.println("Dormir");
	}

}
