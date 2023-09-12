package com.design.pattern.creational.abstractfactorydesign.pattern;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		
		return 50000;
	}

	@Override
	public String name() {
		System.out.println(" I'm Web developer");
		return "Web Developer";
	}

}
