package javapgms;

import java.util.Scanner;

public class PalindromeString {
	/*
	Palindrome String
	
	a palindrome string is a string that remains same when characters are reversed.
	Like i.e. MADAM
*/
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string: \n");
		String str = sc.nextLine();
		
		String OrgStr = str;
		String revStr = "";
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			revStr = revStr+OrgStr.charAt(i);
		}
		
		if(OrgStr.equals(revStr))
		{
			System.out.println(OrgStr+" is a Palindrome String");
		}
		else
		{
			System.out.println(OrgStr+" is not a Palindrome String");
		}

	}

}
