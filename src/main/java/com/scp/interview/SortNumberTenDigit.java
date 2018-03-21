package com.scp.interview;

import java.util.Arrays;

public class SortNumberTenDigit {

	public static void main(String[] args) {
		String number = "2834657901";
		System.out.println("Un-Sorted Number::" + number);
		char[] num = number.toCharArray();
		
		Arrays.sort(num);
		number=Arrays.toString(num);
		System.out.println(number);
				
	}

}
