package edu.ifpe.setima.atividade;

public class Pessoa {
	private String nome;
	final private String cpf;
	private String dataNascimento;
	private double altura;
	
	public Pessoa() {
		this.cpf = "";}
	
	public Pessoa(String nome, String cpf, String dataNascimento, double altura) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	public void imprimirDados(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Ano de nascimento: " + getDataNascimento());
		System.out.println("Altura: " + this.altura);
		System.out.println("CPF: " + getCpf());
		
	}
	

}
