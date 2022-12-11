package testPrograms;
import java.util.Scanner;
public class CallCalculater {
	
	// creating calculater using instance object
	
		public static void main(String[]  arg) {
			int a , b, res;
			Scanner sc = new Scanner(System.in);
			// create objetc to call calculater 
			 calculater cal = new  calculater();
			 
			 //...........note we can create different  objects and also use a single object
			// calculater cal2 = new  calculater();
			// calculater cal3 = new  calculater();
			// cal.add(56,96);
			// cal2.subtract(55, 96);
			 //cal3.multiplay(5,6);
			 
			 
			 System.out.print("\n  addition of two numbers :  " + cal.add(56,96));
			 System.out.print("\n  subtraction of two numbers :  " + cal.subtract(106,96));
			 System.out.print("\n  multiplaication of two numbers :  " + cal.multiplay(5,9));
		}

	}


