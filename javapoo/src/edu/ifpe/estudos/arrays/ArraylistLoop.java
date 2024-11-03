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
		
		ArrayList<Integer> valorItems = new ArrayList<Integer>();
		valorItems.add(1);
		valorItems.add(8);
		valorItems.add(12);
		valorItems.add(9);
		valorItems.add(6);
		
		// Utilizando FOR EACH com outros tipos primitivos
		for(int item: valorItems) {
			System.out.println(item);
		}
		

	}
}