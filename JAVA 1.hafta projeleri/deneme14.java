package simkus;

public class deneme14 {

	public static void main(String[] args) 
	{
		
		String[] ogrenciler = new String[];
		String mesaj = "    bugün hava çok güzel     ";
	      System.out.println(mesaj);
	      System.out.println(mesaj.replace(' ' , '-'));
	      System.out.println(mesaj.substring(2,5));
	      
	      for (String kelime: mesaj.split(" "))
	      {
		      System.out.println(kelime);
	      }
	      
	      System.out.println(mesaj.toLowerCase());
	      System.out.println(mesaj.toUpperCase());
	      System.out.println(mesaj.trim());	      
	      

     
	      
 

    }
}