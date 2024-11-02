package edu.ifpe.estudos.arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArraylistCollections {
	public static void main(String[] args) {
		
		ArrayList<String> listaCarros = new ArrayList<String>();
		listaCarros.add("Caminhão");
		listaCarros.add("Carro popular");
		listaCarros.add("Carro esportivo");
		listaCarros.add("Carro de luxo");
		
		Collections.sort(listaCarros);
		
		for(String items: listaCarros) {
			System.out.println(items);
		}
		
		
	}

}
