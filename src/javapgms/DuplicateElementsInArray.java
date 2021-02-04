package javapgms;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		String arr[]= {"Java","c","c++","python","python","ndoejs","Java"};
		
		//approach 1
		/*
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found Duplicate Element: "+arr[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("Duplicate Element Not Found!");
		}
		
		*/
		
		// approach 2 using HashSet
		
		boolean flag=false;
		
		HashSet<String> lang = new HashSet<>();
		
		for(String l : arr)
		{
			if(lang.add(l)==false)
			{
				System.out.println("found duplicate element: "+l);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("duplicate not found!");
		}
	}

}
