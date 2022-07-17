package corejava;
import java.util.Scanner;
/**
 * Ability to Check Powers of 2 up to 31.
 * @author Veer.Singa
 *
 */
public class PowerOf2 {
/**
 * Created a Class PowerOf2
 * Created a Main Function.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Imported a Scanner and Scanning value and Storing in N.
		 * N is the Power of 2 we Want.
		 * Took a variable and value given of temp as 1.
		 * Created a For Loop up to N.
		 * If Condition for Checking Power Not to Exceed 31.
		 * (temp = temp*2) this will increase the power of 2 for every iteration.
		 * Print the Temp Value.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number N :");
		int N = s.nextInt();
		int temp = 1;
			for ( int i=1;i<=N;i++) {
				if (N<31) {
					temp = temp*2;
					System.out.println("2^"+ i +" = " + temp);
				}
			}

	}

}
