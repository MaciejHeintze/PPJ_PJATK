package Zadania_ksiazka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//zadanie BufferedReader

public class Main {

	public static void main(String[] args) {

		String line = "";
		
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		System.out.println("Podaj linie tekstu i nacisnij Enter: ");
	
		
		try{
			while(!"stop".equals(line)){
			
			line = reader.readLine();
			
			if("stop".equals(line)){
				System.out.println("--------------");
			}else{
				System.out.println(line);
			}
			}
			
			System.out.println("Koniec zadania");
		}catch(IOException e){
			System.out.println("Błąd: "+ e);
		}
		
	}

}
