package edu.ifpe.estudos.arrays;
import java.util.ArrayList;

public class ArraylistLoop {

	public static void main(String[] args) {

		ArrayList<String> comprasMercado = new ArrayList<String>();

		comprasMercado.add("Banana");
		comprasMercado.add("Aveia em flocos");
		comprasMercado.add("Granola");
		comprasMercado.add("Maçã");
		comprasMercado.add("Barrinha de Cereal");

		for(int items=0; items < comprasMercado.size(); items++) {
			System.out.println(comprasMercado.get(items));
		}
		
		System.out.println( );
		
		// utilizando FOR EACH
		for(String items: comprasMercado) {
			System.out.println(items);
		}

	}
}