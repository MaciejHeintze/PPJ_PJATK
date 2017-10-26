package Vet;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
	
	String imie; 
	String gatunek; 
	String imieWlasciciela;
	String waga;
	String wiekMiesiace;
	boolean czyRasowy;
	
	
	
	Object[] options = {"Dodaj zwierze","Zamknij program"};
	
	
    int n = JOptionPane.showOptionDialog(null,"Wybierz opcje ","Options",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
	if(n != JOptionPane.YES_OPTION){

		System.exit(0);
		
	}else{
	
	
		int pytanie = JOptionPane.showConfirmDialog(null, "Czy dodac do bazy nowe zwierze?", null, JOptionPane.YES_NO_OPTION);
		
		if(pytanie != JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "Zamkniecie programu", null, JOptionPane.OK_OPTION);
			System.exit(0);

		}else{
			
			imie=JOptionPane.showInputDialog("Podaj imie zwierzecia: ");
			
			
			String[] gat = { "Ssak", "Gad", "Plaz","Ptak","Ryba"};
			
			String gat1 = (String)JOptionPane.showInputDialog(null,
			"Wybierz gatunek zwierzecia", "Input",
			JOptionPane.INFORMATION_MESSAGE, null,
			gat, gat[1]);
			
			if(gat1.equals("Ssak")){
				gatunek = "Ssak";
			}else if(gat1.equals("Gad")){
				gatunek = "Gad";
			}else if(gat1.equals("Plaz")){
				gatunek = "Plaz";
			}else if(gat1.equals("Ptak")){
				gatunek = "Ptak";
			}else{
				gatunek = "Ryba";
			}
	
			imieWlasciciela = JOptionPane.showInputDialog("Podaj imie i nazwisko wlasciciela (np. Jan Kowalski)");
			
			try{
			waga= JOptionPane.showInputDialog("Podaj wage zwierzecia w kg");
			double wagaWl = Double.parseDouble(waga);
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null,"Bledne dane wejsciowe! Podaj ponownie wage w postaci liczby");
				waga= JOptionPane.showInputDialog("Podaj wage zwierzecia w kg");
		
			}
			double wagaWl = Double.parseDouble(waga);

			try{
			wiekMiesiace = JOptionPane.showInputDialog("Podaj wiek w miesiacach");
			double wiekMiesiaceWl = Double.parseDouble(wiekMiesiace);
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null,"Bledne dane wejsciowe! Podaj ponownie wiek w postaci liczby całkowitej");
				wiekMiesiace = JOptionPane.showInputDialog("Podaj wiek w miesiacach");
				}
			double wiekMiesiaceWl = Double.parseDouble(wiekMiesiace);
			

		    int rasa=JOptionPane.showConfirmDialog(null, "Czy zwierze jest rasowe?",null, JOptionPane.YES_NO_OPTION);
		    if(rasa == JOptionPane.YES_OPTION){
		    	czyRasowy = true;
		    }else{
		    	czyRasowy = false;
		    }
		  	
	
	
		    Animal animal = new Animal(imie, gatunek, imieWlasciciela, wagaWl, wiekMiesiaceWl,czyRasowy);
	
		    
		    animal.show();
		
		
		
		
		}
		
		
		
			
		}
		
	}

}
