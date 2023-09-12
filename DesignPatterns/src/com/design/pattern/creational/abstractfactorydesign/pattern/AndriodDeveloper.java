package com.design.pattern.creational.abstractfactorydesign.pattern;

public class AndriodDeveloper implements Employee{

	@Override
	public int salary() {
	
		return 400000;
	}

	@Override
	public String name() {
		System.out.println("I'm a Android developer.");
		return "Android Developer";
	}

}
