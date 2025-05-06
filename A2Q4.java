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
       // prompt the user to get the input for their class grade percent
       System.out.print("What is your number grade Grade? ");
       number = in.nextDouble();
// this if-if statement takes the input from the scanner and uses boolean expressions to find out the outcome
       // here this if statement take the input
       // is asks if the input is greater than fifty and its less than or equal to 100
       if (number > 50 && number <= 100) {
   	  System.out.println("Pass");
   	// this next if statement takes the input to determine if its a fail
   	  // it compares it to see if its greater than or equal to zero and if it was less than or equal to 50 
   	  // then if the input is put in this range it will print out "Fail"
     }  if (number <= 50 && number >= 0) {
    	 System.out.println("Fail");
     }
     
	}
}
