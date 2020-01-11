import java.util.*;
public class Scramblies {
	
	/*
	 * returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
	 */
    
    public static boolean scramble(String str1, String str2) {
 
      ArrayList<Character> list = new ArrayList<Character>();
      ArrayList<Character> list2 = new ArrayList<Character>();

      	for (int i = 0; i < str1.length(); i++){
      		list.add(str1.charAt(i));
      	}
      
      		for (int i = 0; i < str2.length(); i++){
      			list2.add(str2.charAt(i));
      		}
      
      for (int i = 0; i < list2.size(); i++){
        if (list.contains(list2.get(i))){
        	list.remove(list2.get(i));
        }
        else return false;
      }
      	return true;

    }
}