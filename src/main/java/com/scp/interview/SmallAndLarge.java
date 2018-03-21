package com.scp.interview;

import java.util.Arrays;

public class SmallAndLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {10,2,5,-10,-2,7,8};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println("Small Num:"+num[0]);
		System.out.println("Large Num:"+num[num.length-1]);
	}

}
