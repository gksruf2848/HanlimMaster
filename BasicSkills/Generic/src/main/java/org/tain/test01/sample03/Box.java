package org.tain.test01.sample03;

public class Box<T> {

	private T type;
	
	public Box(T type) { this.type = type; }
	
	public T getType() { return this.type; }
	
	public String toString() { return String.format("[Box : %s]", this.type); }
	
}
