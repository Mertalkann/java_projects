package simkus;

public class deneme6 {

	public static void main(String[] args) 
	{
     int not = 58;
     char grade;
     
     if(not>90) 
     {
    	 grade = 'A';
     }
     else if(not>80)
     {
    	 grade = 'B';
     }
     else if(not>70)
     {
    	 grade = 'C';
     }
     else if(not>50)
     {
    	 grade = 'D';
     }
     else
     {
    	 grade = 'F';	 
     }
     
     
     switch(grade)
     {
        case 'A' :
	   	    System.out.println("başarı durumunuz : Mükemmel");
	   	    break;
        case 'B' :
	   	    System.out.println("başarı durumunuz : İYİ");
	   	    break;
        case 'C' :
	   	    System.out.println("başarı durumunuz : ORTA");
	   	    break;

        case 'D' :
	   	    System.out.println("başarı durumunuz : NORMAL");
	   	    break;

        case 'F' :
	   	    System.out.println("başarı durumunuz : BERBAT");
	   	    break;

     }
}
}  


