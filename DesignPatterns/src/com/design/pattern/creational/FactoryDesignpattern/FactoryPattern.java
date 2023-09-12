package com.design.pattern.creational.FactoryDesignpattern;

public class FactoryPattern {

	public static Employee getInstance(String typeOfEmployee) {
		if (typeOfEmployee.trim().equalsIgnoreCase("Backend developer"))
			return new BackendDeveloper();
		else if (typeOfEmployee.trim().equalsIgnoreCase("Frontend developer"))
			return new FrontEndDevloper();
		else
			return null;

	}

}
