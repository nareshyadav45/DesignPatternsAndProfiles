package com.design.pattern.creational.abstractfactorydesign.pattern;

public class WebDevloperFactory extends EmployeeAbstractFactoryDesign {

	@Override
	public Employee createEmployee() {
		
		return new WebDeveloper();
	}

}
