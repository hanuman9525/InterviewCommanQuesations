package com.scp.congni.pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateInListByUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(8);
		list.add(80);
		list.add(20);
		list.add(80);
		list.add(80);
		Set<Integer> uniqueSet=new HashSet<>();
		List<Integer> duplicateList=new ArrayList<>();
		for(Integer num:list)
			if(!uniqueSet.add(num))
				duplicateList.add(num);
		System.out.println("List of record::\n"+list);
		System.out.println("Unique record from the List::\n"+uniqueSet);
		System.out.println("Duplicate record from the List::\n"+duplicateList);
		
		Map<Integer, Integer> map=new HashMap<>();
		for(Integer num:list)
		if(map.containsKey(num))
			map.put(num,map.get(num)+1);
		else 
			map.put(num,1);
		
		System.out.println("Unique record and duplicate count::");
		Set<Entry<Integer, Integer>> set=map.entrySet();
		for(Entry<Integer, Integer> entry:set)
			System.out.println(entry.getKey()+", "+entry.getValue());
			
	}

}
