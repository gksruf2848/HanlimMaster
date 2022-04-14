package org.tain.test01.sample04;

public class Worker extends Person {
	
	public Worker(String name) { super(name); }
	
	public String toString() {
		return String.format("[Worker : %s]", super.getName()); //getName() 대신에 toString()을 사용하면, "[Person : ]"이 붙는다.
	}

}
