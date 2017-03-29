package Cwiczenia_10;

public class Wyraz {
	String ciag; 
	int ilosc; 
	
	public Wyraz(){
		
		ciag = "";
		ilosc = 0;
	}
	public void dodajZnak(char znak){
		ciag+=znak;
		ilosc++;
	}
	public String toString(){
		return ciag;
	}
	public int length(){
		return ilosc;
	}



}