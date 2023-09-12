package com.design.pattern.creational.singleton;

import java.util.ArrayList;
import java.util.Iterator;

public class UserTest {
	public static void main(String[] args) {
		ArrayList<Users> al=new ArrayList<>();
		al.add(new Users(1, "Srikanth", "1st", 1));
		al.add(new Users(2, "Naresh", "2st", 2));
		al.add(new Users(3, "kanth", "3tt", 3));
		al.add(new Users(4, "anth", "4tt", 4));
		al.add(new Users(5, "ikanth", "5th", 5));
		
//		for (Users users : al) {
//			System.out.println(users);	
//		}
		
		Iterator<Users> iterator = al.iterator();
		while(iterator.hasNext()) {
			Users next = iterator.next();
			if(next.getRollNum()>1) {
			System.out.println(next);
			}
			
		}
		
	}

}
