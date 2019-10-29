package com.countingvalleys.app;

public class CountingValleys {

	public static void main(String[] args) {
		String  str = "DDUUDDUDUUUD";
		char[] chars = str.toCharArray();
		int count1 = 0;
		int valleyCount=0;
		
		
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
		
		System.out.println(valleyCount);
	}

}
