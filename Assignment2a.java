package cs161.a2a;
/**
* Program begins
* Activate scanner
* declare variables
* make a string
* ask for input
* use input from user
* if a zero print out only zero
* print out out if negative or positive
* print out if small or large
* end of program
*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	      
		// heres the declarations of the variable
	double number;
     
     //this activates the scanner to receive input
       Scanner in = new Scanner(System.in);
       // prompt the user to get the input
       System.out.print("What is your number? ");
       number = in.nextDouble();
  //here is where it takes the input from the user to decide if it is small or large. 
  //if it's a zero i wont print out small due to the " && != 0" which means and not equal to zero
     if (number < 1 && number != 0) {
   	  System.out.println("small");
     }
  
     if (number > 1000000) {
     System.out.println("large");
  //here is where it takes the input  and decides if it's a negative or positive.
    }
	 if (number > 0) {
		 System.out.println("positive");
		 }
	 if (number < 0) {
		 System.out.println("negative");
	 }
	//here is the final one to declare it being just a zero 
	 if (number == 0) {
		 System.out.println("zero");
	 }
	 
	 
	 
	 
	}

	
}
