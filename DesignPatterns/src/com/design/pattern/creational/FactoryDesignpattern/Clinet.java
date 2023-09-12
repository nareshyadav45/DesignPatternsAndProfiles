package com.design.pattern.creational.FactoryDesignpattern;

public class Clinet {
public static void main(String[] args) {
	
//	Employee ee=new BackendDeveloper();
//	String developer = ee.developer();
//	System.out.println(developer);
	
	Employee FrontendInstance = FactoryPattern.getInstance("frontend developer");
	//System.out.println(FrontendInstance.developer());
	
	Employee backendInstance = FactoryPattern.getInstance("backend developer");
	System.out.println(backendInstance.developer());
	System.out.println(backendInstance.hashCode());
	
	
	Employee backendInstance2 = FactoryPattern.getInstance("backend developer");
	System.out.println(backendInstance2.hashCode());
	
	Employee instance = FactoryPattern.getInstance("owkssok");
	System.out.println(instance.developer());
	
}
}
