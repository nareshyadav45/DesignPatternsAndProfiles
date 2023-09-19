package com.design.pattern.Behavioural.observer;

public interface Subject {

	public void subscribe(Observer observer);
	public void unsubscribe(Observer observer);
	public void updates(String updateName);
	
	
	
	
	
}
