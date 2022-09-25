package simkus;

public class deneme13 {

	public static void main(String[] args) 
	{
      String mesaj = "bugün hava çok güzel";
      System.out.println(mesaj);
      
      System.out.println("eleman sayısı :" +mesaj.length() );
      System.out.println("5 eleman  :" +mesaj.charAt(4) );
      System.out.println(mesaj.concat("yaşasın")); // sonuna atıyor
      System.out.println(mesaj.startsWith("b")); // true false değer döndürür
      System.out.println(mesaj.endsWith("l")); 
      
      char[] karakterler = new char[5];
      mesaj.getChars(0, 5, karakterler, 0);
      System.out.println(karakterler); 

      System.out.println(mesaj.indexOf('a')); // ilk bulduğunu verir
      System.out.println(mesaj.lastIndexOf('a')); // ilk bulduğunu verir sağdan başlar


      


      
      
     
	}

}
