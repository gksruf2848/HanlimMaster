package org.tain.test01.sample01;

public class Box<T> {
	
	private T type;
	
	public Box() { };
	
	public Box(T type) { this.type = type; }
	
	public T getType() { return this.type; }
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Box : ");
		sb.append(this.type);
		sb.append("]");
		
		return sb.toString();
	}

}
