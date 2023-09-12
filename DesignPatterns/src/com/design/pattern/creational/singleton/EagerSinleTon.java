package com.design.pattern.creational.singleton;

public class EagerSinleTon {
	private  EagerSinleTon() {
	}
	private static EagerSinleTon eager=new EagerSinleTon();
	
	public static EagerSinleTon getInstanceEager() {
		return eager;
	}

}
