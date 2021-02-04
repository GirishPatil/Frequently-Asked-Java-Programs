package javapgms;

public class EvenOddfromArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Even numbers in a Array are....");
		/*
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]);
			}

		}
		*/
		// approach 2 using enhanced for loop
		
		for(int value: a)
		{
			if(value%2==0)
			{
				System.out.print(value);
			}
		}
		
		System.out.println();
		
		System.out.println("Odd numbers in a array are...");
		
		/*
		for(int i=0;i<a.length; i++)
		{	
			if(a[i]%2!=0)
			{
				System.out.print(a[i]);
			}
		}
		*/
		
		// approach 2 using enhanced for loop
		
		for(int value: a)
		{
			if(value%2!=0)
			{
				System.out.print(value);
			}
		}
		
	}

}
