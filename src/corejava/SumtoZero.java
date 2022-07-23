package corejava;

import java.util.Scanner;

public class SumtoZero {

	 public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.println("Total numbers are ?");
	        int n = scanner.nextInt();
	       
	        int arr[] = new int[n];
	       
	        System.out.println("Enter your numbers in array 1");
	        for(int i=0;i<n;i++) {
	            arr[i] = scanner.nextInt();
	        }
	        System.out.println("Enter your numbers in array 2");
	        for(int j=0;j<n;j++) {
	            arr[j] = scanner.nextInt();
	        }
	        System.out.println("Enter your numbers in array 3");
	        for(int k=0;k<n;k++) {
	            arr[k] = scanner.nextInt();
	        }
	       
	        for(int i = 0;i<n;i++) {
	           
	            for(int j = 0;j<n;j++) {
	               
	                for(int k = 0;k<n;k++) {
	                   
	                    if(arr[i]+arr[j]+arr[k] == 0) {
	                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
	                    }
	                    else
	                    	System.out.println("There are no values that are equal");
	                }
	               
	            }
	           
	        }
	       
	        scanner.close();
	    } 

}
