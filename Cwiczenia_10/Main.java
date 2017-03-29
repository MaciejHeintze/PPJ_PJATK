package Cwiczenia_10;

public class Main {

	public static void main(String[] args) {

		Kwadrat kwadrat = new Kwadrat(5);
		kwadrat.show();
		Walec walec = new Walec(2,2);
		walec.show1();
		kwadrat.przygotujWalec();
		
		
		Wyraz wyraz = new Wyraz();
		wyraz.ciag="aa";
		System.out.println(wyraz);
		wyraz.dodajZnak('b');
		System.out.println(wyraz);
		wyraz.toString();
		System.out.println("Długość ciągu:"+wyraz.length());
		
		String str= "Ala ma kota a kot ma Ale";
		String str1 = "kot";
		Wyraz2 wyraz2 = new Wyraz2(str);
		Wyraz2 wyraz3 = new Wyraz2(str1);
		wyraz2.setNastepnyWyraz(wyraz3);
		wyraz2.show2();

}
}