package simkus;

public class deneme16 {

	public static void main(String[] args) 
	{
		int number = 2;
		int kalan = number % 2 ;
		boolean isPrime = true;
   if(number == 1)
		{
		      System.out.println("sayı asal değildir");
		      return;
		}   
	for (int i=2 ; i<number; i++) 
	{
		if(number % i == 0)
		{
			isPrime = false;
		}
	}
	if(isPrime == true)
	{
	      System.out.println("sayı asal değildir");
	}
	else {System.out.println("sayı asaldır");}
    }
}