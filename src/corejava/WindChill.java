package corejava;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Welcome to Wind Chill Program");
		 int t,v;
		 System.out.println("Enter Temperature");
		 t= sc.nextInt();
		 System.out.println("Enter Velocity if Wind");
		 v= sc.nextInt();
		 
		 double w = (35.74 +(0.6215*t)+((0.4275*t)-35.75)*Math.pow(v,0.16));
		 
		 if (t>50 || v>120 || v<3)
			 System.out.println("The Temperature or Velocity is Not in Range to "
			 		+ "Check Wind Chill \nPlease Recheck and Enter");
		 else
		 System.out.println("The Effective wind Chill : "+w);
	}

}