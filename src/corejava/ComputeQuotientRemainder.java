package corejava;
import java.util.Scanner;
/**
 * Finding Remainder and Quotient of Particular Number
 * @author singa
 *
 */

public class ComputeQuotientRemainder {
/**
 * Created a Class ComputeQuotientRemainder with main Function.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * created all variables req for division process.
		 * scanning divident and divisor.
		 * remainder and quotient can be found by its math operation.
		 * Print the quotient and ramainder.
		 * 
		 */
		int divident,divisor,remainder,quotient;
		System.out.println("Enter the Values Divident & Divisor");
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		divident = s1.nextInt();
		divisor = s2.nextInt();
		remainder = divident % divisor;
		quotient =divident / divisor;
		System.out.println("The Remainder is "+remainder+" The Quotient is "+quotient);

	}

}
