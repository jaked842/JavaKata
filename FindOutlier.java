import java.util.*;

public class FindOutlier{
	public static void main (String [] args) {
		
		FindOutlier f = new FindOutlier();
		
		int[] exampleTest1 = {}; 
	    int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}; 
	    int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
		
		System.out.println(f.find(exampleTest3));
	}
	
  static int find(int[] integers){
 
  ArrayList<Integer> odd = new ArrayList();
  ArrayList<Integer> even = new ArrayList();
  
  
  for (int i = 0; i < integers.length; i++){
      if (integers[i] == 0){
        even.add(0);
      }
      
      else if (integers[i] == 1){
        odd.add(1);
      }
      
      else if ((integers[i] % 2) == 0){
        even.add(integers[i]);
      }
        
     else if ((integers[i] % 2) > 0){
        odd.add(integers[i]);
      }    
  }
  
  if (odd.size() > even.size()){
    return even.get(0);
  }
  
  return odd.get(0);
  
}
}