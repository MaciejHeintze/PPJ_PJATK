package Cwiczenia_13;

public class Kontener {
	Cukierek ladunek;
	double masaLadunku;
	int dniPrzydatnosci;
	
	public Kontener(double masaLadunku){
		this.masaLadunku=masaLadunku;
	}
	 public Kontener zaladuj(Cukierek ladunek, int dniPrzydatnosci){
		this.ladunek = ladunek;
		this.dniPrzydatnosci=dniPrzydatnosci;
		return this;
	}
	 public boolean sprawdzPrzydatnosc(int dni){
		
		 return(dni < dniPrzydatnosci);
		 
	 }

	 public String toString(){
		 return ladunek.smak+" o masie "+ladunek.waga+" jest wazny jeszcze "+dniPrzydatnosci+" dni.";
	 }
}