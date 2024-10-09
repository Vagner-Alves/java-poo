package edu.ifpe.oitava.atividade;

public class Pessoa {
	private String nome;
	private final String cpf;
	private String dataNascimento;
	private double altura;
	
	public Pessoa(String nome ,String cpf, String dataNascimento, double altura) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void imprimirDados() {
		System.out.println("CPF: "+ this.cpf );
		System.out.println("nome: " + this.nome);
		System.out.println("data de nascimento: " + this.dataNascimento);
		System.out.println("altura: " + this.altura);
	}

}
