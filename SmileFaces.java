import java.util.*;

public class SmileFaces {
	
	/*
	 * Given an array (arr) as an argument complete the function countSmileys 
	 * that should return the total number of smiling faces.
	 */
  
  public static int countSmileys(List<String> arr) {
	  int count = 0;
        for (int i = 0; i < arr.size(); i++) {
        	switch (arr.get(i)){
	  
        	case ":)":
        		count++; continue;
        	case ":D":
        		count++; continue;
        	case ":-D":
        		count++; continue;
        	case ":~)":
        		count++; continue;
        	case ":~D":
        		count++; continue;
        	case ":-)":
        		count++; continue;
        	case ";)":
        		count++; continue;
        	case ";-)":
        		count++; continue;
        	case ";D":
        		count++; continue;
        	case ";-D":
        		count++; continue;
        	case ";~)":
        		count++; continue;
        	case ";~D":
        		count++; continue;
        	}
        }  
      return count;
  }
  
}