package edu.ifpe.quinta.atividade.pacote1;

public class Pessoa {
	private String nome;
	private int anoNascimento;
	private double altura;
	
	public Pessoa() {}
	
	public Pessoa (String nome, int anoNascimento, double altura) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.altura = altura;
	}
	
	public void imprimirDados(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Ano de nascimento: " + this.anoNascimento);
		System.out.println("Altura: " + this.altura);
	}
	
	public int calcularIdade() {
		return 2024 - this.anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
