package javapgms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		// logic1 using algorithm
		
		int rev=0;
		
		while(num!=0)
		{
			rev= rev*10 + num%10;
			num= num/10;
		}
		
		// logic 2 using StringBuffer class
		/*
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		
			*/
		
		//logic 3 using StringBuilder class
		/*
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		*/
		System.out.println("reverse number is: " +rev);
	}

}
