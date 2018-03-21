package com.scp.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindFirstRepetativeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hanumanadale";
		char[] ch=str.toCharArray();
		HashSet<Character> set=new HashSet<Character>();
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if(set.contains(ch[i]))
			{
				System.out.println("First Repetative Char::"+ch[i]);
				break;
			}
			else
				set.add(ch[i]);
		}
	}

}
