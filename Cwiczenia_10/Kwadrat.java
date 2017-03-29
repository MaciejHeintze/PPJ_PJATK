package Cwiczenia_10;

public class Kwadrat {
	double bok; 
	
	
	public Kwadrat(double bok){
		this.bok = bok;
	}
	
	void show(){
		System.out.println("Pole powierzchni kwadratu: "+bok*bok);
		System.out.println("Objetosc szescianu: "+bok*bok*bok);
	}
	public Walec przygotujWalec() { 
	
		return new Walec(bok/2, bok); 
	}

}
