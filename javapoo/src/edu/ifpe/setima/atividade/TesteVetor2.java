package edu.ifpe.setima.atividade;

public class TesteVetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] listadeNumeros = {1,2,3,4,5,6};
		
		for (int numeros: listadeNumeros) {
			if( numeros % 2 == 0){
				
				System.out.println("Os números a seguir são pares: " + numeros);
					}
			else {
				System.out.println("Os números a seguir são ímpares: " + numeros);
			}
		}

	}

}
