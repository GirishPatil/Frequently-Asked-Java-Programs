package javapgms;

import java.util.Arrays;

public class EqualityofTwoArrays {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6};
		// approach 1
		/*
		boolean status= Arrays.equals(a, b);
		
		if(status==true)
		{
			System.out.println("arrays are equal");
		}
		else
		{
			System.out.println("arrays are not equal");
		}
		*/
		//approach 2
		
		boolean status=true;
		
		if(a.length==b.length)
		{
			// comparison of elements
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					status=false;
				}
				else
				{
					status=true;
				}
			}
		}
		else
		{
			status=false;
		}
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are NOT equal");
		}
	}

}
