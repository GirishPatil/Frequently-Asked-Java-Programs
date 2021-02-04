package javapgms;

public class MaxAndMinElementsinArray {

	public static void main(String[] args) {
		int a[]= {50,20,10,40,30,60};
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println("Maximum value in an array is: "+max);
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("Minimum value in an array is: "+min);

	}

}
