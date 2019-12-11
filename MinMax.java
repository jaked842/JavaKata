import java.util.*;
public class MinMax {
	public static void main(String[] args) throws Exception {
 int [] demo = new int [] {2334454, 5};
 
 String t = Arrays.toString(MinMax.minMax(demo));
 System.out.println(t);
		  
	
	  }
	
	public static int [] minMax (int[] arr) {
		int sml = arr[0];
		int lrg = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(sml > arr[i]) {
				sml = arr[i];
			}
			else if (lrg < arr[i]) {
				lrg = arr[i];
			}

		}
		
		 int [] test = new int [] {sml, lrg};
		 	return test;
	}
	}