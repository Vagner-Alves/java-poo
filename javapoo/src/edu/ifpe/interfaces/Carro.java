package edu.ifpe.interfaces;

public class Carro implements Veiculos, GPS{
	@Override
	public void Ligar() {
		System.out.println("Ligar");
	}
	
	@Override
	public void Parar() {
		System.out.println("Parar");
	}
	
	@Override
	public void coordenadas() {
		System.out.println("Coordenadas: Latitude 40.818º N, Longitude 74.0080º W");
	}

}
