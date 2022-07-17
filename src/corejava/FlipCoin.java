package corejava;
import java.util.Scanner;
/**
 * Flip a Coin and find the Percentage of Heads and Tails
 * @author Veer.Singa
 *
 */
public class FlipCoin {
	/**
	 * Created a Class FlipCoin with Main Function.
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * Created 3 variables i,j,k.
		 * Imported Scanner and Scanning a Number to give how many times to flip
		 * Created a For Loop upto given flip Number from Scanner
		 * Generating a random Number using Math.Random and saving it in Percent
		 * Created a If Else Condition
		 * If - Percent value is equal to 0 it prints tails
		 * Else - it Prints Heads.
		 * we are counting them by j and k values.
		 * we will check the percentage of j and k from whole flips.
		 * Saving j in (Tails) and k in (Heads)
		 * printing the wholes percentage of heads and tails.
		 * The End.
		 * 
		 */
		// TODO Auto-generated method stub
		System.out.println("Welcome to Flip Coin Program");
		int i,j=0,k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times to flip the Coin");	
		int FlipNum = sc.nextInt();
		System.out.println("Entered value is " +FlipNum);
		for(i=1;i<=FlipNum;i++) {
			int Percent = (int) Math.floor(Math.random()*2);
			if (Percent == 0) {
				System.out.println("The flip side is Tails");
				j++;
				}
			else {
				System.out.println("The flip side is Heads");
				k++;
				}
		}
		System.out.println("Number of tails is"+j);
		System.out.println("Number of Heads is"+k);
		float tails = (float) (j*100)/FlipNum;
		float heads = (float)(k*100)/FlipNum;
		System.out.println("Percentage of Tails is"+tails+" %");
		System.out.println("Percentage of Heads is"+heads+" %");

	}

}
