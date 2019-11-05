package com.countingvalleys.app;

public class CountingValleys {

	public static void main(String[] args) {
		//https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
		//hacker rank input
		String  str = "DDUUDDUDUUUD";
		
		//declarations
		char[] chars = str.toCharArray();
		int count1 = 0;
		int valleyCount=0;
		
		//get the valleys by coords
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] == 'D')
			{
				count1--;
			}
			if(chars[i] == 'U')
			{
				count1++;
			}
			
			if(count1 == 0 && chars[i] == 'U')
			{
				valleyCount++;
			}
			
			
		}
		
		System.out.println("Valleys passed: "+valleyCount);
	}

}
