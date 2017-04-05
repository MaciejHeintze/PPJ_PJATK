package Cwiczenia_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int liczba;
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		System.out.println("Podaj liczby, które mają być w liście i zatwierdz enter." +"\n"+ "Aby zakończyć dodawanie wpisz 0."+"\n"+"Liczby: ");
		
		do{
			liczba = scan.nextInt();
			lista.add(liczba);
			
		}while(liczba != 0);
		
		int index=lista.lastIndexOf(0);
		lista.remove(index);
		System.out.println("Nasza lista: ");
		System.out.println(lista);
	}
}
