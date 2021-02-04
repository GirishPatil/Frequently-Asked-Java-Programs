package javapgms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		// array should not have any duplcates
		//array need not to be sorted order
		//values should be in range
		
		
		int a[]= {1,2,4,5,6};
		int sum=0;
		int sum2=0;
		
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println("Sum of Array is: "+sum);
		
		for(int i=1;i<=6;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("sum of range of array is : "+sum2);
		
		System.out.println("Missing number in an Array is: "+(sum2-sum));

	}

}
