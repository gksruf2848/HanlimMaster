package org.tain.test01.common;

public class Tv {
	
	private String name;
	
	public Tv() { }
	
	public Tv(String name) { this.name = name; }
	
	public String getName() { return this.name; }
	
	public String toString() { return String.format("[Tv : %s]", this.name); }

}
