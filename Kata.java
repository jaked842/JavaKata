import java.util.Scanner;
class Kata {
  
	public static String getMiddle(String word) {
     if (word.length() % 2 == 0) {							//is for even numbered words
        char c = word.charAt(word.length() / 2);
        char b = word.charAt(word.length() / 2 - 1);
       
        String s = String.valueOf(b) + String.valueOf(c);
        return s;
     }
     else  {						                       //is for odd numbered words
    	 char c = word.charAt(word.length() / 2);
    	 
    	 String s = String.valueOf(c);
    	 return s;
     }
     
    
  }
	
public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a word: ");
	String s = input.nextLine();
	
	System.out.println("middle letter(s) are / is: " + getMiddle(s));
	
}
}
