package javapgms;

public class CountSumOfDigitsInNumber {

	public static void main(String[] args) {
		int num = 12345;
		
		int sum=0;
		
		while(num>0) {
			int num1= num%10;
			sum = sum+num1;
			num = num/10;
		}
		System.out.println("sum of digits in a number is: "+sum);

	}

}
