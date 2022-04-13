package org.tain.test01.common;

public class Car {
	
	private String name;
	
	public Car() { }
	
	public Car(String name) { this.name = name; }

	public String getName() { return this.name; }
	
	public String toString() { return String.format("[Car : %s]", this.name); }
}
