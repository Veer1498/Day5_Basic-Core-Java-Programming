package corejava;

import java.util.Scanner;
/**
 * To check Number is Even Or Odd
 * @author Veer.singa
 *
 */
public class EvenOdd {
	/**
	 * Class EvenOdd with main function.
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scan a Number and store in Num.
		 * if num is 0 it shows invalid
		 * else if num divisible by 2 and gives rem 0, it is even.
		 * else it is odd.
		 * print the particular statement present in conditions.
		 */
		int num;
		System.out.println("Enter The Number");
		Scanner s = new Scanner(System.in);
		num =s.nextInt();
		if (num == 0) {
			System.out.println("Entered Number is invalid (0)");
		}
		else if (num % 2 == 0){
			System.out.println("The Number is Even");
		}
		else {
			System.out.println("The Numebr is Odd");
		}

	}

}
