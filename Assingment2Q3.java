package cgcc.edu.cs161A2q2;
/**
 * program begins
 * activate scanner
 * take input from user
 * activate string
 * if input is below zero
 * print("Negative")
 * else print ("positive")
 * end program
 */

//for the activation of the scanner
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	      
		// heres the declarations of the variable
	double number;
     
     //this activates the scanner to receive input
       Scanner in = new Scanner(System.in);
       // prompt the user to get the input
       System.out.print("What is your number? ");
       number = in.nextDouble();
// this if else statement takes the input from the scanner from the user than decides whether its positive or negative
     if (number > 0 || number == 0) {
   	  System.out.println("Positive");
     } else {
    	 System.out.println("Negative");
     }
	}
}
