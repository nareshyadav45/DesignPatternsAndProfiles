package com.design.pattern.creational.singleton;

import java.io.Serializable;

public class Single implements Serializable,Cloneable {

	private static Single single;

	private Single() {
		if (single != null)
			throw new RuntimeException("Object already created for singleton class please try to create again....");

	}

	public static Single getSingleInstnace() {
		if (single == null) {
			synchronized (Single.class) {
				if (single == null) {
					single = new Single();
				}
			}
		}

		return single;

	}
	
	public Object readResolve() {
		return single;
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		//return super.clone();
          return single;		
	}
	
	
	
	
	

}
