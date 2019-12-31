import java.util.*;

public class FindOutlier{
	
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