package javapgms;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[]= {4,6,7,2,5,7};
		
		int sum=0;
		int sum1=0;
		
		for(int i=0; i<=a.length-1; i++)
		{
			sum = sum+a[i];
		}
		
		System.out.println("sum of array elements is: "+ sum);
		
		// approach 2 using for each loop
		
		for(int value : a)
		{
			sum1 = sum1+value;
		}
		System.out.println("sum of array elements is: "+ sum1);

	}

}
