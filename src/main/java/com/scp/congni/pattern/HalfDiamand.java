package com.scp.congni.pattern;

public class HalfDiamand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HalfDiamand.pattern();
	}

	public static void pattern() {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

}
