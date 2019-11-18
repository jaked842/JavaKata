import java.util.Scanner;
import java.util.*;
public class EXP6 {

public static void main (String []args) {
Scanner input = new Scanner(System.in);

for (int i = 0; i < 3; i++) {
System.out.print("Enter your expression: ");
String expression = input.next();

EXP6 test = new EXP6();

System.out.println(test.isItBalanced(expression));
}
}

Stack <Character> open = new Stack<>();
Stack <Character> close = new Stack<>();


public boolean isItBalanced (String inputExpr) {
	for (int i = 0; i < inputExpr.length(); i++) {
		char check = inputExpr.charAt(i);
		
		if (check == '{') 
			open.push(check);
		else if (check == '(')
			open.push(check);
		else if (check == '[')
			open.push(check);
		
		else if (check == '}')
			close.push(check);
		else if (check ==')')
			close.push(check);
		else if (check ==']') 
			close.push(check);
	}	
	int t = close.size();
	
	for (int i = 0; i < t; i++) {
		char check = close.elementAt(0);
		
		
	if(check == '}' && open.peek() == '{') {
		open.remove(open.lastElement());
		close.remove(0);}
	else if(check =='}' && open.peek() != '{') {
	    	System.out.print("Mismatch found: " + "'" + close.elementAt(0) + "'" + " at ");
	    	System.out.print(inputExpr.indexOf(close.elementAt(0)) + " / ");
			return false;}
		
	else if (check == ')' && open.peek() == '(') {
			    open.remove(open.lastElement());
				close.remove(0);}
	else if(check ==')' && open.peek() != '(') {
	    	System.out.print("Mismatch found: " + "'" + close.elementAt(0) + "'" + " at ");
	    	System.out.print(inputExpr.indexOf(close.elementAt(0)) + " / ");
			return false;}
		
	else if (check ==']' && open.peek() == '[' ) {
			    open.remove(open.lastElement());
				close.remove(0);}
	else if(check ==']' && open.peek() != '[') {
	    	System.out.print("Mismatch found: " + "'" + close.elementAt(0) + "'" + " at ");
	    	System.out.print(inputExpr.indexOf(close.elementAt(0)) + " / ");
			return false;}
	
	}
	if (open.isEmpty())
		return true;
	
	return false;
	
}
}



			



	




	


