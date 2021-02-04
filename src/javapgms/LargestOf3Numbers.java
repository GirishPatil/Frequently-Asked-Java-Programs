package javapgms;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the second number :");
		int b = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the third number :");
		int c = sc2.nextInt();
		
		// Approach 1 Logic
		
		if(a>b && a>c) {
			System.out.println(a+" a is the largest number");
		}
		else if(b>a && b>c){
			System.out.println(b+" b is the largest number");
			
		}
		else if(c>a && c>b){
			System.out.println(c+" c is the largest number");
		}
		else{
			System.out.println("no one is large number!!!");
		}
		
		// approach 2 using ternary operators
		
		int largest1 = a>b?a:b;
		int largest2 = c>largest1?c:largest1;
		
		System.out.println(largest2+" is largest number");

	}

}
