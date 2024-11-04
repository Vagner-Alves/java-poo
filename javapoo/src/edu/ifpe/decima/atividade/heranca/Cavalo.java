package edu.ifpe.decima.atividade.heranca;

public class Cavalo extends Animal {
	private String raca;

	public Cavalo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cavalo(float tamanho, String cor, String raca) {
		super(tamanho, cor);
		this.raca = raca;
		// TODO Auto-generated constructor stub
	}
	
	public void fugir() {
		System.out.println("O cavalo está fugindo!");
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
