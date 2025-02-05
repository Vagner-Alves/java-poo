package edu.ifpe.interfaces.atividade;

public class Smartphone {
	 private String estacaoAtual;
	    private int volumeAtual;

	    
	    public void setStation(String estacao) {
	        this.estacaoAtual = estacao;
	        System.out.println("Sintonizado na estação: " + estacao);
	    }

	    public void setVolume(int volume) {
	        this.volumeAtual = volume;
	        System.out.println("Volume ajustado para: " + volume);
	    }

	   
	    public String getCoordenadas() {
	        return "Latitude: -23.5505, Longitude: -46.6333"; 
	    }

	  
	    public float somar(float a, float b) {
	        return a + b;
	    }

	   
	    public float dividir(float a, float b) {
	        if (b == 0) throw new ArithmeticException("Divisão por zero!");
	        return a / b;
	    }

}
