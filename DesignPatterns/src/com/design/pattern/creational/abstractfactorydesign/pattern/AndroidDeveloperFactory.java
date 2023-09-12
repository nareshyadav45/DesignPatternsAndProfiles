package com.design.pattern.creational.abstractfactorydesign.pattern;

public class AndroidDeveloperFactory extends EmployeeAbstractFactoryDesign {

	@Override
	public Employee createEmployee() {
		
		return new AndriodDeveloper();
	}

}
