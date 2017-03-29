package Cwiczenia_10;

public class Walec {
	double promien,wysokosc;
	
	public Walec(double promien ,double wysokosc){
		this.promien=promien;
		this.wysokosc=wysokosc;
	}
	
	void show1(){
		System.out.println("Ppp walca:"+2*Math.PI*promien);
		System.out.println("Objetosc walca:"+ 2*Math.PI*promien*wysokosc);
	}
	
	

}
