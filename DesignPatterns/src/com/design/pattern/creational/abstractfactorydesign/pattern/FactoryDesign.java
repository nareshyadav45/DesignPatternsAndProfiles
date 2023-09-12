package com.design.pattern.creational.abstractfactorydesign.pattern;

public class FactoryDesign {
	public static Employee getEmployee(EmployeeAbstractFactoryDesign abstractFactory) {
		return abstractFactory.createEmployee();
	}

}
