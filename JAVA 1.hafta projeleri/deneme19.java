package simkus;

public class deneme19 {

	public static void main(String[] args) 
	{
		  int[] number = {1, 2 , 3, 4, 7};
		  int finder = 70 ;
		  
		  for(int i=0;i<number.length;i++)
		   {
	    	 if(finder == number[i]) 
	    	 {
	    		 System.out.println("bulundu");
	    		 return;
	    	 }
		   }
		  System.out.println("bulunamadı");

	}

}
