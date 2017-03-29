package Cwiczenia_10;

public class Wyraz2 {
	String wyraz; 
	Wyraz2 wyraz2;
	
	public Wyraz2(String wyraz){
		this.wyraz=wyraz;
	}
	void setNastepnyWyraz(Wyraz2 wyraz2){
		this.wyraz2=wyraz2;
	}
	
	void show2(){
		System.out.println(wyraz);
		wyraz2.show2();
	}

}
