package com.design.pattern.creational.abstractfactorydesign.pattern;

public class AbstractClient {
	public static void main(String[] args) {

		Employee e1 = FactoryDesign.getEmployee(new WebDevloperFactory());
		e1.name();

		Employee e2 = FactoryDesign.getEmployee(new AndroidDeveloperFactory());
		e2.name();
	}
}
