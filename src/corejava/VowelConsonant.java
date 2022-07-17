package corejava;
import java.util.Scanner;
/**
 * Check the Alphabet.
 * @author Veer.singa
 *
 */

public class VowelConsonant {
/**
 * Class VowelConsonant with main function.
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanning letter and storing in Alphabet.
		 * check alphabet with vowels with if else condition.
		 * if equals with any letter it is vowel
		 * else it is consonant
		 * 
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter the Alphabet");
		char Alphabet = s.next().charAt(0);
		
		if (Alphabet == 'A' || Alphabet == 'a'||Alphabet == 'E'||Alphabet == 'e'||Alphabet == 'I'||Alphabet == 'i' ||Alphabet == 'O'||Alphabet == 'o'||Alphabet == 'U'||Alphabet == 'u') {
			System.out.println("The Letter '"+Alphabet+"' is Vowel");
		}
		else {
			System.out.println("The Letter '"+Alphabet+"' is Consonant");
		}

	}

}
