package edu.ifpe.estudos.arrays;
import java.util.ArrayList;
public class Arraylists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("fusca");
		cars.add("BMW");
		cars.add("brasilia amarela");
		cars.add("porsche - roxo");
		
		System.out.println(cars);
		
		// adicionar items escolhendo a posição
		cars.add(0, "aston martin");
		System.out.println(cars);
		
		// acessar um item no ArrayList
		System.out.println(cars.get(1));
		
		// modificando um elemento, utilizando indice
		cars.set(0, "aston martin - verde e amarelo");
		System.out.println(cars);
		
		// removendo um item 
		cars.remove(1);
		System.out.println(cars);
		
		// removendo todos os items ( limpando a lista)
		cars.clear();
		System.out.println(cars);
		
		// ver o tamanho do ArrayList
		System.out.println(cars.size());
	}

}
