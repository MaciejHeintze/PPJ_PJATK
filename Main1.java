package Cwiczenia_7;

import java.util.Random;

public class Main1 {

	public static void main(String[] args) {

		// zadanie 1 -----------------
/*		
		String [ ] slowa = {
				 "Ala" , "kota" , "ma" , "ma" , "a" , "kot" , "Ale"
				 } ;
		
		System.out.print(slowa[0]+" "+slowa[2]+" "+slowa[1]+" "+slowa[4]+" "+slowa[5]+ 
				 
				" "+slowa[3]+" "+slowa[6]); 
*/
System.out.println();
// zadanie 2 ---------------------
/*
 
		int x = 0;
		String zdanie = "Ala ma kota";
		char tab[] = new char[zdanie.length()];
		
		for(int i=0; i<tab.length; i++){
			tab[i] = zdanie.charAt(i);
		}
		for(int i=0; i<tab.length; i++){
			if(tab[i]=='a'|| tab[i]=='A'){
				x++;
			}
		}
		System.out.println("W tablicy litera a wystąpiła: "+x+" razy.");
		
*/
// zadanie 3 ----------------------
/*		
		Random generator = new Random();
		int tab1[] = new int[20];
		
		for(int i=0; i<18; i++){
			tab1[i] = generator.nextInt();
			System.out.print(tab1[i]+", ");
		}
		int y = 10; 
		for(int i = 18; i>=y; i--){ 
		tab1[i+1] = tab1[i]; 
		} 
		tab1[y] = -1; 
		 System.out.println();
		for(int i = 0; i<20; i++){ 
		 
		System.out.print(tab1[i]+", "); 
		}
*/ 


// zadanie 5 -----------------------------------
/*
char [] tab = new char[]{'p','r','o','g','r','a','m'};

System.out.print("Oryginalne: ");
for(int i = 0; i < tab.length; i++){
	System.out.print(tab[i]);
}	

char znak;
System.out.println();

System.out.print("Zaszyfrowane: ");
	for(int i = 0; i < tab.length; i++){
		znak = (char)(tab[i] + i);
		System.out.print(znak);
		
	}

System.out.println();	

System.out.print("Odszyfrowane: ");	
for(int i = 0; i < tab.length; i++){
	znak = (char)(tab[i] + i);
	System.out.print((char)(znak - i));
}

*/


// zadanie 6 -----------------------------------------

/*
Random generator = new Random();		
int zmienna1 = generator.nextInt(1000), zmienna2 = generator.nextInt(1000), zmienna3 = generator.nextInt(1000);
		
		int[] t = new int[zmienna1];
		int [] t1 = new int[zmienna2];
		int [] t2 = new int[zmienna3];
		
		for(int i=0; i<t.length; i++){
			t[i] = generator.nextInt();
		//	System.out.println(t[i]);
		}
		for(int i=0; i<t1.length; i++){
			t1[i] = generator.nextInt();
		//	System.out.println(t1[i]);
		}
		for(int i=0; i<t2.length; i++){
			t2[i] = generator.nextInt();
		//	System.out.println(t2[i]);
		}
		
		int [][]t4 = new int[][]{t,t1,t2};
		
		for(int i=0; i<t4.length; i++) { 
			for(int j=0; j<t4[i].length; j++){
			 
			System.out.println(t4[i][j]+ " "); 
			}
			System.out.println();
		}	
	
*/	

// zadanie 4 ----------------------------------

int [] tab = new int[10]; 
Random generator = new Random();
int ilosc = 0;

	for(int i = 0; i < tab.length ; i++){
		tab[i] = generator.nextInt(2);
		System.out.print(tab[i]+" ");
		
	}	
		
	for(int j = 0; j < 8 ; j++){
		if(tab[j] == 1 && tab[j+1] == 0 && tab[j+2] == 1){
			ilosc += 1;
			
	}
		
}
	
	System.out.println();
	System.out.println("Sekwencja zaszla " +ilosc+ " razy.");
	
	}

}
