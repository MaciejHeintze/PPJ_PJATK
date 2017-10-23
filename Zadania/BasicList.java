package Zadania;

import java.util.ArrayList;
import java.util.Scanner;

//podstawowa lista zakupów z użyciem ArrayList
public class BasicList {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		String produkt = "";
		System.out.println("Wpisz produkty i kazdy zatwierdz ENTER\nAby zakonczyc wpisz x\nProdukty:");
		try{
			while(!"x".equals(produkt)){
				
			produkt = scan.nextLine();
			lista.add(produkt);
			}
		}catch(Exception e){
			System.out.println("Blad wczytywania danych"+e);
		}
		
		System.out.println("Opcje list:\n1.Wyswietl liste\n2.Usun liste i zakoncz program\n3.Dodaj produkty i wyswietl liste\n4.Zakoncz dzialanie programu");
		
		
		lista.remove(lista.size()-1);
		
		int opcja = scan.nextInt();
		switch(opcja){
		
		case 1:
			System.out.println("Lista zakupow: ");
			for(int i=0; i<lista.size();i++){
				System.out.println((i+1)+"."+lista.get(i).toString());
			}
			
			break;
		case 2:
			lista.clear();
			System.out.println("Lista usunieta");
			
		
			break;
		case 3:
			System.out.println("Wpisz dodatkowe produkty i zatwierdz ENTER\nAby zakonczyc wpisz q");
		
			try{
			while(!"q".equals(produkt)){
				
				produkt = scan.nextLine();
				lista.add(produkt);
				}
			}catch(Exception e){
				System.out.println("Bład"+e);
			}
			lista.remove(lista.size()-1);
			System.out.println("Lista zakupow: ");
			for(int i=0; i<lista.size();i++){
				System.out.println(lista.get(i).toString());
			}
			
			break;
		case 4: 
			System.out.println("Program zakonczony");
			System.exit(0);
			break;
			
		
			
		
		}
		scan.close();
		
		}
		
		
		
		
		
		

	}


