package com.design.pattern.creational.builder;

public class BuilderClient {
	public static void main(String[] args) {
		
		Computer build = new Computer.ComputerBuilder("dell", "2GB", "OKTA Proccessor").build();
		
		System.out.println(build);
		
       // Computer build2 = new Computer.ComputerBuilder("dell", "2GB", "OKTA Proccessor").setBluetoothEnabled(true).build();
		
		//System.out.println(build2);
		
		
		
	}

}
