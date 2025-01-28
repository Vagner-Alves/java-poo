package edu.ifpe.interfaces;

public class Main {
	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		
		meuCarro.Ligar();
		meuCarro.Parar();
		meuCarro.Buzinar();
		
		meuCarro.coordenadas();
	}

}
