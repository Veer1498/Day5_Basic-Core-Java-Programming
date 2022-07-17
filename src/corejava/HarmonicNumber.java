package corejava;
import java.util.Scanner;

//Harmonic Number Program
public class HarmonicNumber {
/**
 * Created Class Harmonic Number with Main Function
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Created variables res and hNum and initialized with 0.
		 * Imported a Scanner and Scanned values to store in Num.
		 * Created a For Loop up to given Number.
		 * hNum is stored as 1 divided by i.
		 * Took a result for adding all Harmonic Numbers and Print result.
		 */
		double res=0,hNum =0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int Num = s.nextInt();
		System.out.println("The Harmonic Series is ");
		for ( int i=1;i<=Num;i++) {
			hNum = (double)1/i;
			System.out.println(hNum);
			res+=hNum;
		}
		System.out.println("The Sum of Harmonic Numbers is "+res);

	}

}
