package edu.ifpe.interfaces;

public interface Veiculos {
	void Ligar();
	void  Parar();
	
	default void Buzinar() {
		System.out.println("Buzinar");
	}

}
