package edu.ifpe.decima.atividade.heranca;

public class Leao extends Animal {
	private boolean juba;
	
	public Leao() {
		super();
	}
	
	public Leao(float tamanho, String cor, boolean juba) {
		super(tamanho, cor);
		this.juba = juba;
	}
	
	public void cacar() {
		System.out.println("O leão começou a caçada!");
	}
	
	public boolean getJuba() {
		return juba;
	}
	
	
	public void setJuba(boolean juba) {
		this.juba = juba;
	}
}
