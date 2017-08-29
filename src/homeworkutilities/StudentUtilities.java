package homeworkutilities;

public class StudentUtilities {

	private static String domain="@cybertekschool.com";
	
	public static String generateEmail(String name){
		return name+domain;
	}
	
	private static int randomNumbers(){
		int random=(int)(Math.random()*9999+1000);
		
		return random;
		
	}

   public static String generateId(String str){
	   return  str.toLowerCase()+randomNumbers();
   }
   
   


	
	
	
}
