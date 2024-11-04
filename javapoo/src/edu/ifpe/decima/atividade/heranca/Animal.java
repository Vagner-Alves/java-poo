package edu.ifpe.decima.atividade.heranca;

public class Animal {
	private float tamanho;
	private String cor;
	
	public Animal() {}
	
	public Animal(float tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
	}
	
	public void comer() {
		System.out.println("O animal está comendo");
	}
	
	public float getTamanho() {
		return tamanho;
	}
	
	public void setTamanho( float valor) {
		tamanho = valor;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String valor) {
		cor = valor;
	}

}
