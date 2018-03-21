package com.scp.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RepetativeCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hanumanadale";
		char[] ch=str.toCharArray();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if(map.containsKey(ch[i]))
				map.put(ch[i],map.get(ch[i])+1);
			else
				map.put(ch[i],0);
		}	
		System.out.println(map);
	}

}
