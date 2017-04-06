package Cwiczenia_9;

import java.util.Random;

public class Main {

	

		// zadanie 4 
		
		static void Euklides(){
            
            Random generator = new Random();        
            for(int i=0;i<10;i++){
                
                
                System.out.println((i+1)+" wylosowana para: ");
                int a,b;
                a=generator.nextInt(101);
                b=generator.nextInt(101);
                System.out.print("a = "+a+"\t"+"b = "+b+"\n");   
                
                
                while (a != b)
                {
                if (a > b)
                    a = a-b;
                else
                    b = b-a;
                }
                    System.out.println("NWD to: "+a);    
                    System.out.println();
            }      
       }
		
			
			
			
			// zadanie 1 ---------
			 private static  void kwadrat(int n, char znak){
			        char znak2 = znak == 'x' ? 'o' : 'x';
			        for(int i = 0;i < n;i++)
			        {
			            for(int j = 0;j < n;j++)
			            {
			                if((i+j)%2 == 0)
			                	System.out.print(znak);
			                else 
			                	System.out.print(znak2);
			            }
			            System.out.print('\n');
			        }

			    }
			 // zadanie 3 --------
			 
			 private static boolean isDiagonal(int [] [] a){
			        if(a.length != a[0].length)
			            return false;
			        for(int i = 0;i < a.length;i++){
			            if(a[i][i] != 0) return false;
			        }
			        return true;
			    }
			 // zadanie 2 --------------
			 static char tablica(char tab[][]){
			 		
					
			 		int ilosc = 0;
				
					for(int i = 0; i < tab.length; i++){
						for(int j = 0; j < tab[i].length;j++){
							if(tab[i][j] == 'a' && tab[i][j+1] == 'l' && tab[i][j+2] == 'a'){
							ilosc++;
							} else if(tab[i][j] == 'a' && tab[i+1][j] == 'l' && tab[i+2][j] == 'a'){
							ilosc++;
							} else if(tab[i][j] == 'a' && tab[i+1][j+1] == 'l' && tab[i+2][j+2] == 'a'){
							ilosc++;
							} else if(tab[tab[i].length - i][j]== 'a' && tab[tab[i].length-1-i][j+1] == 'l' && tab[tab[i].length-2-i][j+2]== 'a');
							ilosc++;
								
					}
					
				}	
					System.out.println("Wystapilo "+ilosc+" wyrazow Ala");
					return 0;
					
			 }
			
			public static void main(String[] args) {
				//Euklides();
				//kwadrat(3, 'o');
				
				  int[][]tab  = {
						  	{0,1,1},
		                    {1,1,1},
		                    {0,0,0}
		                    };
		    // System.out.println(isDiagonal(tab));
		     
		     // zadanie 2 ------
		     Random generator = new Random();
		     char tab1[][] = new char[10][10];
		     for(int i=0; i<tab1.length;i++){
		    	 for(int j=0; j<tab1[i].length;j++){
		    		 tab1[i][j] = (char) (generator.nextInt(26)+97);
		    		 System.out.print(tab1[i][j]+" ");
		    	 }System.out.println();
		     }
	
		     tablica(tab1);
	}

}
