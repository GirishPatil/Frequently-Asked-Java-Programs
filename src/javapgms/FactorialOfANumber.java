package javapgms;

public class FactorialOfANumber {
	
	// Factorial of a number
	// A factorial is a function that multiplies a number by every number below it.
	// for exmple
	// 5! = 5x4x3x2x1 = 120
	// or
	// 5!= 1x2x3x4x5 = 120

	public static void main(String[] args) {
		
		int num = 5;
		int factorial = 1;
		/*
 		for(int i=1;i<=num;i++) // in acending order
		{
			factorial=factorial*i;// 1 2 6 24 120
		}
 		*/
 		for(int i=num; i>=1;i--) // descending order
 		{
 			factorial = factorial*i;
 		}
		
 		System.out.println("factorial of a number is : "+ factorial);

	}

}
