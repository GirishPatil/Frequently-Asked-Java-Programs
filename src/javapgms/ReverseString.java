package javapgms;

public class ReverseString {

	public static void main(String[] args) {
		
		//declare a string
		String a = "abcd";
		// variable for storing reversed string, it is empty at first
		String rev= "";
		/*
		
		//1. reverse string using + (concatenation operator,length method and charAt method)
		
		// find the length of string
		int len = a.length();
		
		// iterate string in reverse order
		for(int i=len-1; i>=0;i--)
		{
			// extract character of a string using charAt() and store in variable and 
			//it will give reversed string
			rev = rev+a.charAt(i);
		}
		*/
		
	/*	
		//2. using character Array
		
		char c[] = a.toCharArray();
		int len1 = c.length; // 4
		
		for(int i=len1-1;i>=0;i--) // 3 2 1 0
		{
			rev = rev + c[i]; // dcba
		}
		
		// print the reversed string
		System.out.println("reversed string is: "+ rev); // dbca
		*/
		
		// 3. using stringbuffer class
		
		StringBuffer sb1= new StringBuffer(a);
		System.out.println("reverserd string is: "+ sb1.reverse()); // use inbuilt reverse() method
		
		
		
		

	}

}
