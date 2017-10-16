package Zadania_ksiazka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//zadanie BufferedReader, parse, funkcja matematyczna int i double

public class Klasa {

	public static void main(String[] args) {

		double a1,b1,a,b,x1;
		
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		
		String line = "";
		String line2 = "";
		
		System.out.println("Wpisz liczbe a oraz b z f.kwadratowej i zatwierdz kazda Enter: ");
	
		try{
			line = reader.readLine();
			line2 = reader.readLine();
			
		}catch(IOException e){
			System.out.println("Błąd: "+e);
		}
		
		try{
			a = Double.parseDouble(line);
			System.out.println("a: "+a);
			b = Double.parseDouble(line2);
			System.out.println("b: "+b);
			a1= Double.parseDouble(line);
			b1= Double.parseDouble(line2);

			a = a1;
			b = b1;
			
			if(a==1&&b==1){
			
				System.out.println("Funkcja int: f(x)="+"x"+"+"+(int)b1);
				System.out.println("Funkcja z liczbami zmiennoprzecinkowymi: f(x)="+"x"+"+"+b);
			}else{
				System.out.println("Funkcja int: f(x)="+(int)a1+"x"+"+"+(int)b1);
				System.out.println("Funkcja z liczbami zmiennoprzecinkowymi: f(x)="+a+"x"+"+"+b);
			}
			
			System.out.println();
			System.out.println("Podaj dla jakiej wartości x obliczyć funkcje i zatwierdz enter: ");
			
			String line3 = "";
			try{
				line3 = reader.readLine();
			}catch(IOException e){
				System.out.println("Blad: "+e);
			}
			
			try{
				x1= Double.parseDouble(line3);
				
				System.out.println("x: "+x1);
				System.out.println("Wynik obliczen: ");
				double wynik = (a*x1)+b;
				System.out.println("f("+x1+")="+wynik);

			}catch(Exception e){
				System.out.println("Bład: "+e);
			}
			
			
			}catch(Exception e){
			System.out.println("Błąd "+e);
		}
	}

}
