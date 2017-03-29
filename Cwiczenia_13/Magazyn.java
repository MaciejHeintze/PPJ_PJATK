package Cwiczenia_13;

public class Magazyn {
	
	ElementStosu pierwszy;
	int count = 0;
	
	public void przyjmijKontener(Kontener kontener){
		
		try{
		ElementStosu terazElement = new ElementStosu(kontener);
		
		if(pierwszy == null){
			pierwszy = terazElement;
		}else{
		
		if(count <5){
			ElementStosu x = pierwszy;
			while(x.nastepny != null){
				x=x.nastepny;
				x.nastepny=terazElement;
			}
			}else{
				throw new Exception();
			}
			}
		count++;
		
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

	public Kontener wydajKontener(int i) throws Exception
	{
		if(count > 0)
			if(i == 1)
			{
				count--;
				Kontener k1 = pierwszy.kontener;
				pierwszy = pierwszy.nastepny;
				return k1;
			}else
				if(i <= count && (i-1) > 0)
				{
					count--;
					ElementStosu x=pierwszy;
					while(--i > 0)
						x = x.nastepny;
					Kontener k2 = x.nastepny.kontener;
					x.nastepny=x.nastepny.nastepny;
					return k2;
				}else
					throw new Exception();
		throw new Exception();
	}
}
