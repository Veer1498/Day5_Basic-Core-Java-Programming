package corejava;
import java.util.Scanner;
/**
 * Swap 2 Numbers.
 * @author singa
 *
 */
public class Swap2Numbers {
/**
 * Class Swap2Numbers with Main Function.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanned 2 numbers and stored in a,b.
		 * traverse the values by
		 * store a in temp.
		 * store b in a.
		 * store temp in b.
		 * print a and b the numbers.
		 */
		int a,b,temp;
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		System.out.println(" Enter The Value of A & B ");
		a= s1.nextInt();
		b= s2.nextInt();
		System.out.println("Before Swap");
		System.out.println(" The Value of A = "+a+"\n The Value of B = "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swaping ");
		System.out.println(" The Value of A = "+a+"\n The Value of B = "+b);

	}

}
