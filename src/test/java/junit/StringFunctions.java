package junit;

public class StringFunctions {
	
	public static boolean isPlaindrome(String str) {
        
       int i = 0, j = str.length() - 1; 
       
       while (i < j) {
    	   
           if (str.charAt(i) != str.charAt(j)) 
               return false; 

           i++; 
           j--; 
       } 
 
       return true; 
		
		
		
	}
	
}
