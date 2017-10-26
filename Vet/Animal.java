package Vet;

import java.util.Random;

import javax.swing.JOptionPane;

public class Animal {
	
	private String animalName, imieWlasciciela, animalType;
	private double waga;
	private double wiekMiesiace;
	private boolean czyRasowy;

	
	public Animal(String animalName,String animalType, String imieWlasciciela, double waga, double wiekMiesiace, boolean czyRasowy)
	{
		this.animalName=animalName;
		this.animalType=animalType;
		this.imieWlasciciela=imieWlasciciela;
		this.waga=waga;
		this.wiekMiesiace=wiekMiesiace;
		this.czyRasowy=czyRasowy;
	}
	public static double obliczWiek(double miesiace){
		
		double wiek = miesiace/12;
		
		return Math.round(wiek);
	}
	
	public int animalID(){
		Random generator = new Random();
		int id = generator.nextInt(9999);
		return id;
	}
	
	
	public void show(){
		JOptionPane.showMessageDialog(null,"Animal ID: 000"+animalID()+"\n"+  "Gatunek: "+animalType+"\n"+"Imie zwierzecia: "+ animalName+"\n"+"Wlasciciel: "+imieWlasciciela+"\n"+"Waga: "+waga+"kg"+"\n"+"Wiek: "+obliczWiek(wiekMiesiace)+"lata ("+(int)wiekMiesiace+" miesiace)"+"\n"+"Rasowy: "+czyRasowy);
	}

}
