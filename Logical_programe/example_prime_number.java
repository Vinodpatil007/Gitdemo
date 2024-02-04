package Logical_programe;

import java.util.Scanner;

public class example_prime_number {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter no . ");
		//int num =scan.nextInt();
	int num =6;
		int count =0; 
		 for (int i=2;i<num;i++)
		 {
			 if(num%i==0)
			 {count++;
			 break;}}
		 if(count==1)
		 {System.out.println("not prime no.");}
		 else
		 {System.out.println("prime no.");
		 
		 }
			 
		
	}

}
	