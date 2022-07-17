package corejava;
import java.util.Scanner;

//Find Factors of Selected Number
public class Factors {
	/**
	 * Class Factors with main Class
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner to take Num.
		 * Created a For Loop to iterate up to N.
		 * If N % i is equal to 0 it will print i.
		 * Then Divide it by i to decrease value.
		 * if Num became greater than 2 it will Print Last Num.
		 */
		int Num,i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		Num =s.nextInt();
		int temp = Num;
		System.out.println("The Factors of "+temp+" are ");
		for (i= 2;i<=Num;i++ ) {
			while(Num % i==0) {
				System.out.println(i+"");
				Num=Num/i;
			}			
		}
		if(Num>2)
			System.out.println(Num+" ");

	}

}
