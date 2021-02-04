package javapgms;

public class Swapping2values {

	public static void main(String[] args) {
		int x = 10, y = 20;
		
		System.out.println("Before swapping... "+x +" "+y);
		
		// logic 1 using third variable
		
		/*int temp;
		
		temp = x;
		
		x = y;
		
		y = temp;*/
		
		// logic 2 without using third variable , swapping using + & - operators
		
		/*
		x = x+y; // 10+20=30
		y= x-y;  // 30-20=10
		x= x-y; //  30-10=20
*/		
		
		// logic 3 using * & / operators
		// only for non zero values
		// without using 3rd variable
		/*
		x=x*y; //10*20=200
		y=x/y; //200/10=20
		x=x/y; //200/20=10
		*/
		
		// logic 4 using bitwise ^ (XOR) operator
		/*
		x=x^y;
		y=x^y;
		x=x^y;
		*/
		
		// logic 5 using single statement
		
		y=x+y-(x=y); // operation from right to left
		System.out.println("After swapping... "+x +" "+y);

		
		
	}

}
