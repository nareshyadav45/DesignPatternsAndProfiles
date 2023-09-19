package com.design.pattern.Behavioural.observer;

public class Subsciber implements Observer{
	String name;
	

	public Subsciber(String name) {
		this.name = name;
	}


	@Override
	public void notified(String updateName) {
		System.out.println("Hello "+this.name+" new update are came please check :"+ updateName);
		
		
	}
	

}
