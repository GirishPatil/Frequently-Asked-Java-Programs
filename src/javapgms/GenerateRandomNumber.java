package javapgms;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// approach 1 using random class	
		
		Random rand = new Random();
		
		int int_rand= rand.nextInt(10); // range from 0 to 999
		System.out.println(int_rand);
		
		double rand_dbl= rand.nextDouble();// 0.0 to 1.0
		System.out.println(rand_dbl);
		
		
		// approach 2 using math class
		/*
		System.out.println(Math.random());
		*/
		
		// approach 3 using apache commons-lang api
		// http://commons.apache.org/
		/*
		String randNum=RandomStringUtils.randomNumeric(5);
		System.out.println(randNum);
		
		
		String randStr= RandomStringUtils.randomAlphabetic(5);
		System.out.println(randStr);
		
		*/
	}

}
