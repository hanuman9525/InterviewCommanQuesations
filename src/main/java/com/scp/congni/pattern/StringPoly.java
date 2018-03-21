package com.scp.congni.pattern;

public class StringPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcba";
		int flag=0;
//Actual string polindrome logic is here
		for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--)
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=1;
			}
		if(flag==0)
			System.out.println("String is Polindrome");
		else
			System.out.println("String is not Polindrome");
	}

}
