import java.util.*;
public class Dillon_Jacob_TestException {

public static void main (String []args) {

Dillon_Jacob_TestException test = new Dillon_Jacob_TestException();

		System.out.println("Enter:" + "\n" + "(a) for Aston Martin"  + "\n" + "(b) for BMW" + "\n" + "(c) for Maserati"
		 + "\n" + "(d) for Porsche");

Scanner input = new Scanner(System.in);

	for (int i = 0; i < 10; i++){
	
		String c = input.next();
			char t;
				t = c.charAt(0);
	try {
		test.addCars(t);
	}

	catch (CarException a) {
		System.out.println("(ERROR) You entered: " + t + "\n" + "Enter a, b, c, or d");
		a.printStackTrace();
		System.exit(1);
	}

}

		System.out.println(test.carr);

}

ArrayList<Car> carr = new ArrayList<>();


public void addCars(char c) throws CarException {
	
	if (c > 'd') {
		throw new CarException();
	}
	
	else if (c == 'a') {
		AstonMartin car1 = new AstonMartin();
		carr.add(car1);
		
	}
	
	else if (c == 'b') {
		BMW car2 = new BMW();
		carr.add(car2);
		
	}
	
	else if (c == 'c') {
		Maserati car3 = new Maserati();
		carr.add(car3);
		
	}
	
	else if (c == 'd') {
		Porsche car4 = new Porsche();
		carr.add(car4);
	
	}

}

	
}

class CarException extends Exception{
	
}



class Car { }
class AstonMartin extends Car { public String toString() { return "Aston Martin"; } }
class BMW extends Car { public String toString() { return "BMW"; } }
class Maserati extends Car { public String toString() { return "Maserati"; } }
class Porsche extends Car { public String toString() { return "Porsche"; } }


