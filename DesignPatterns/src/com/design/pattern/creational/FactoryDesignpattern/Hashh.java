package com.design.pattern.creational.FactoryDesignpattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Hashh {
	public static void main(String[] args) {

//		Map<String, Integer> hash=new HashMap<>();
//		hash.put("Naresh", 45);
//		hash.put("Sanghemsh", 55);
//		hash.put("Saurabh", 65);
//		hash.forEach((k,v)->System.out.println(k+" value"+v));
//		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		for(String s:hash.keySet()) {
//			System.out.println(hash.get(s));
//		}

		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(12);
		hashSet.add(11);
		hashSet.add(2);
		hashSet.add(10);

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(34);
		ll.add(35);
		Integer integer = ll.get(0);
		System.out.println(integer);

	}

}
