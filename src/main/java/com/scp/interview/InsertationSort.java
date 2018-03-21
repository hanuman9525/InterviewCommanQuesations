package com.scp.interview;

import java.util.Arrays;

public class InsertationSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsorted = { 8, 2, 3, 4, 10, 6 };
		for (int i = 0; i < unsorted.length; i++) {
			int current = unsorted[i];
			int j = i;
			while (j > 0 && unsorted[j - 1] > current) {
				unsorted[j] = unsorted[j - 1];
				j--;
			}
			unsorted[j]=current;
		}
		System.out.println(Arrays.toString(unsorted));
	}

}
