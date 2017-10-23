package Zadania;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

//obliczanie pola i obwodu kola przy pomocy StreamTokenizer'a oraz Scanner'a

public class Pole {

	public static void main(String[] args) {

//STREAMTOKENIZER
		StreamTokenizer stream = new StreamTokenizer(
				new BufferedReader(
						new InputStreamReader(System.in)
						)
				);
		
		System.out.println("Wprowadz promien kola i zatwierdz ENTER: ");
		
		try{
			while(stream.nextToken() != StreamTokenizer.TT_NUMBER){
				System.out.println("Nie prawidłowe dane!!! Podaj ponowanie promien: ");

			}
			}catch(IOException e){
				System.out.println("Bład: "+e);
			}

		double promien = stream.nval;
		
		double pole = Math.PI*Math.pow(promien, 2);
		double obj = 2*Math.PI*promien;
		
		System.out.println("Wynik przy uzyciu StreamTokenizera\n");
		System.out.println("Promien: "+promien+"\n"+"Pole kola wynosi: "+pole+"\n"+"Objetosc kola wynosi: "+obj+"\n");
	
//---------------------------------------------------------------------------------------------------------
//SCANNER
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj promien drugiego kola i zatwierdz ENTER: ");
		
			
			while(!scan.hasNextDouble()){
				System.out.print("Zla wartosc promienia!");
				System.out.println(scan.next());
				System.out.print("Wprowadź ponownie wartość promienia: ");
				}
			
			
		double promien1 = scan.nextDouble();
		double pole1 = Math.PI*Math.pow(promien1, 2);
		double obj1 = 2*Math.PI*promien1;
		
		
		System.out.println("Wynik przy uzyciu Scannera\n");
		System.out.println("Promien: "+promien1+"\n"+"Pole drugiego kola wynosi: "+pole1+"\n"+"Objetosc drugiego kola wynosi: "+obj1);
		
		scan.close();
		
	}
		
		
	}


		
	


