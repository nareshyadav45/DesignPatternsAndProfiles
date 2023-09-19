package com.design.pattern.Behavioural.Iterator;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {
	
	List<User> listOfUsers=new ArrayList<>();
	
	public void addUser(User user) {
		listOfUsers.add(user);
	}
	
	public User getUser(int index) {
		return listOfUsers.get(index);
	}
	
	public MyIterator getMyIterator() {
		return new MyIteratorImpl(listOfUsers);
	}

}
