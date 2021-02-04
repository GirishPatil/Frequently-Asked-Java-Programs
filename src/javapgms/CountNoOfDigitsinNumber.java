package javapgms;

import java.util.Scanner;

public class CountNoOfDigitsinNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number :");
		int num = sc.nextInt();
		
		int count = 0;
		
		while(num>0)
		{
			num = num/10;
			count++;
		}
		
		System.out.println("Number of digits in a number is : "+count);
	}

}
