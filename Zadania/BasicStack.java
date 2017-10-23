package Zadania;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

//lista rzeczy przy uzyciu stosu

public class BasicStack {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		Scanner scan = new Scanner(System.in);
		
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in)
				);
		
		System.out.println("Wprowadz liste rzeczy do spakowania i zatwierdz kazde ENTER: \nAby zakonczyc wpisz x");
		String line="";
		try{
			while(!"x".equals(line)){
			line=reader.readLine();
			stack.push(line);
			
			}
		}catch(IOException e){
			System.out.println("Bład: "+e);
		}
		System.out.println("Wprowadzono nastepujace rzeczy: ");

		if(stack.isEmpty()){
			System.out.println("Brak danych wejsciowych");
		}else{
			stack.pop();
			int i = 1;
			for(Object o: stack)
			
			System.out.println((i++)+"."+o.toString());
			
			}
		
		System.out.println();
		
		int line1=0;
		String line2="";
		
		System.out.println("Wpisz nr operacji i zatwierdz ENTER\n\n1.Dodaj rzecz i wyswietl liste\n2.Zakoncz dzialanie programu");
		
		try{
			line1=scan.nextInt();
			
			switch(line1){
			
			case 1: 
				System.out.println("Wprowadz liste dodatkowych rzeczy do spakowania i zatwierdz kazde ENTER: \nAby zakonczyc wpisz x");
				try{
					while(!"x".equals(line2)){
					line2=reader.readLine();
					stack.push(line2);
					
					}
				}catch(IOException e){
					System.out.println("Bład: "+e);
				}
				stack.pop();
				
				if(stack.isEmpty()){
					System.out.println("Brak danych wejsciowych");
				}else{
					
					int i = 1;
					for(Object o: stack)
					
					System.out.println((i++)+"."+o.toString());
				}
				
				
				break;
				
				
			case 2:
				System.out.println("Zakonczono dzialanie programu");
				System.exit(0);
				
				break;
				
			
				
		}
			
			
		}catch(Exception e){
			System.out.println("Blad: "+e);
		}
	
		scan.close();
		
	}

}
