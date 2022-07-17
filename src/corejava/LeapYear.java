package corejava;
import java.util.Scanner;
/**
 * Determine if the Year is Leap Year or Not
 * @author Veer.singa
 *
 */

public class LeapYear {
	/**
	 * Created a Class LeapYear with main Function.
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * Created a Scanner and giving value and storing in variable Year.
		 * Created an If-Else Condition
		 * First - Check If Year is Divisible by 4.
		 * Next - Check If Year is Divisible by 400. 
		 * Next - If both Above Conditions satisfied, Check Year is Divisible by 100. 
		 * If all the Conditions are Passed It will Print The year is Leap Year.
		 * Else it will Print Not a Leap Year.
		 *  
		 */
		Scanner year = new Scanner(System.in);
		System.out.println("Enter the Year");
		int Year = year.nextInt();
		System.out.println("Enered Year ="+Year);
		if (Year % 4 ==0   ) {
			if(Year %400 ==0 ) {
				if (Year % 100 ==0) {
					System.out.println("The year" +Year+"is Leap Year");
	
				}
			}			
		}
		else
			System.out.println("The year " +Year+" is Not Leap Year");	

	}

}
