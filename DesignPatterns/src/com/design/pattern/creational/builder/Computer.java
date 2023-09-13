package com.design.pattern.creational.builder;

public class Computer {
	//required
	private String name;
	private String ram;
	private String cpu;

	//optional
	private boolean isBluetoothEnabled;
	private boolean isWifiEnabled;
	public String getName() {
		return name;
	}
	public String getRam() {
		return ram;
	}
	public String getCpu() {
		return cpu;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	public boolean isWifiEnabled() {
		return isWifiEnabled;
	}
	
	
	@Override
	public String toString() {
		return "Computer [name=" + name + ", ram=" + ram + ", cpu=" + cpu + ", isBluetoothEnabled=" + isBluetoothEnabled
				+ ", isWifiEnabled=" + isWifiEnabled + "]";
	}
	private Computer(ComputerBuilder builder) {
		this.cpu=builder.cpu;
		this.name=builder.name;
		this.ram=builder.ram;
		
		this.isBluetoothEnabled=builder.isBluetoothEnabled;
		this.isWifiEnabled=builder.isWifiEnabled;
	}
	
	public static class ComputerBuilder{
		//required
		private String name;
		private String ram;
		private String cpu;

		//optional
		private boolean isBluetoothEnabled;
		private boolean isWifiEnabled;
		
		public ComputerBuilder(String name,String ram,String cpu) {
			this.cpu=cpu;
			this.ram=ram;
			this.name=name;
			
		}

		

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public ComputerBuilder setWifiEnabled(boolean isWifiEnabled) {
			this.isWifiEnabled = isWifiEnabled;
			return this;
			
		}
		
		public Computer build() {
			return new Computer(this);
		}
		
	}
	
	
	
}
