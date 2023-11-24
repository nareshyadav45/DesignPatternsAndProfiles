package com.design.pattern.Behavioural.Iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorTest {
public static void main(String[] args) {
	
	UserManagement userMangement=new UserManagement();
	userMangement.addUser(new User("Naresh", "12"));
	userMangement.addUser(new User("Suresh", "45"));
	userMangement.addUser(new User("Ramesh", "90"));
	
	MyIterator myIterator = userMangement.getMyIterator();
	while(myIterator.hasNext()) {
		User next = (User)myIterator.next();
		System.out.println(next.getName());
	}
}
}
