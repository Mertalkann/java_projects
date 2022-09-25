package simkus;

public class deneme17 {

	public static void main(String[] args) 
	{
		int number = 6;
		int toplam = 0;
		for(int i =1; i < number; i++) 
		{
			if(number % i  == 0)
			{
				toplam = toplam + i;		
			}
			else {}
		}
		System.out.println("mükemmel sayıdır");
    }
}