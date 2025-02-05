package edu.ifpe.interfaces.atividade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Smartphone meuCelular = new Smartphone();

	       
	        meuCelular.setStation("FM 89.5");
	        meuCelular.setVolume(75);

	       
	        System.out.println("Coordenadas: " + meuCelular.getCoordenadas());

	    
	        float resultadoSoma = meuCelular.somar(10, 2);
	        float resultadoDivisao = meuCelular.dividir(10, 2);
	        
	        System.out.println("Soma: " + resultadoSoma);      // 12.0
	        System.out.println("Divisão: " + resultadoDivisao); // 5.

	}

}
