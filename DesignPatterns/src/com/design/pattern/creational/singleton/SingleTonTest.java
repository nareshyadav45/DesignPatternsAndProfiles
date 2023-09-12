package com.design.pattern.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleTonTest {
	public static void main(String[] args) throws ClassNotFoundException {

//		Single singleInstnace = Single.getSingleInstnace();
//		System.out.println(singleInstnace.hashCode());
//		Single singleInstnace2 = Single.getSingleInstnace();
//		System.out.println(singleInstnace2.hashCode());
//		
//		
//		System.out.println(EagerSinleTon.getInstanceEager().hashCode());
//		System.out.println(EagerSinleTon.getInstanceEager().hashCode());

//		Single s1 = Single.getSingleInstnace();
//		System.out.println(s1.hashCode());
//		
//		//System.out.println(Single.getSingleInstnace().hashCode());
//		
//		try {
//			Constructor<Single> constructor = Single.class.getDeclaredConstructor();
//			constructor.setAccessible(true);
//			try {
//				Single s2 = constructor.newInstance();
//				System.out.println(s2.hashCode());
//			} catch (InstantiationException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IllegalAccessException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IllegalArgumentException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (InvocationTargetException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//			
//			
//		} catch (NoSuchMethodException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		

		
		Single s1 = Single.getSingleInstnace();
        System.out.println(s1.hashCode());
        
        try {
			Single s2= (Single) s1.clone();
			System.out.println(s2.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
