package Cwiczenia_13;



public class Fabryka {
	
	private Cukierek[] tab = new Cukierek[3];
	
	public Cukierek make(int x){
		x-=1;
		if(x< tab.length){
			if(tab[x] != null)
				return tab[x];
			else
				tab[x] = make1(x);
				return tab[x];
		}
		
			return null;
		}
	private Cukierek make1(int x){
		x+=1;
		switch(x){
		case 1: 
			return new Cukierek("Malinowy", 22.1);
		case 2:
			return new Cukierek("Bananowy", 41.2);
		case 3:
			return new Cukierek("Jablkowy", 14.5);
		}
		return null;
	}

}
