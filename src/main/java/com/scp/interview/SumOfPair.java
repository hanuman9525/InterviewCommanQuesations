package com.scp.interview;

public class SumOfPair {

	public static void main(String[] args) {
		int[] num = { 10, 20, 8, 2, 5, 9, 1 };
		int sum = 10;
		for (int i = 0; i <= num.length - 2; i++) {
			for (int j = i+1; j <= num.length - 1; j++) {
					if (sum == (num[i] + num[j]))
						System.out.println("Pair:" + num[i] + "-" + num[j]);
			}
		}
	}

}
