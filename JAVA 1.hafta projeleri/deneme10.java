package simkus;

public class deneme10 {

	public static void main(String[] args) 
	{
	  char[] kalin = {'a','ı','o','u'};
	  char[] ince = {'e','i','ö','ü'};
	  char harf= 'e';
	  
	 
      for(int i=0;i<kalin.length;i++)
	   {
    	 if(harf == kalin[i]) 
    	 {
    		 System.out.println("sesli kalın harf");
    		 return;
    	 }
    	 else
    	 {
    		 for(int j=0;j<ince.length;j++)
    		   {
        		 System.out.println("sesli ince harf");
        		 return;
    		   } 
    	 }
	   }
      
   
	}
}
