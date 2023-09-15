package com.design.pattern.creational.prototype;

public class PrortoClient {
	public static void main(String[] args) throws CloneNotSupportedException {
		NetWorkConnection netWorkConnection1 = new NetWorkConnection();
		netWorkConnection1.setIp("192.65.90");
		netWorkConnection1.getImportantData();
		
		System.out.println(netWorkConnection1);
		
		
		try {
			NetWorkConnection netWorkConnection2 = (NetWorkConnection)  netWorkConnection1.Clonable();
			System.out.println(netWorkConnection2);
			Object clonable = netWorkConnection2.Clonable();
			System.out.println(clonable);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		NetWorkConnection netWorkConnection3 =(NetWorkConnection) netWorkConnection1.Clonable();
		System.out.println(netWorkConnection3);
		
		//Shallow cloning  means cloning an existing object when we do changes in cloned object changes will reflects in existing object and cloned object also it means shallow cloning ...  
		//netWorkConnection1.Clonable()
	
	}

}
