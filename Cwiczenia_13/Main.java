package Cwiczenia_13;


public class Main {

	public static void main(String[] args) {

	//	Cukierek c1 = new Cukierek("Truskawkowy", 12);
	//	c1.show();
		Fabryka fabryka = new Fabryka();
		Magazyn magazyn = new Magazyn();

		magazyn.przyjmijKontener(new Kontener(100).zaladuj(fabryka.make(2), 150));
		magazyn.przyjmijKontener((new Kontener(100).zaladuj(fabryka.make(2), 10)));
		magazyn.przyjmijKontener((new Kontener(100).zaladuj(fabryka.make(3), 10)));

		for(int i = 0; i < 3; i++)
			try
			{
				System.out.println(magazyn.wydajKontener(1));
			}catch(Exception e)
			{
				System.out.println(e);
			}
	
		try{
			System.out.println(magazyn.wydajKontener(2));
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
