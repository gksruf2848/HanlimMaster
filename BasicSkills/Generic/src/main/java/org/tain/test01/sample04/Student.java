package org.tain.test01.sample04;

public class Student extends Person {
	
	public Student(String name) { super(name); }
	
	public String toString() {
		return String.format("[Student : %s]", super.getName()); //getName() 대신에 toString()을 사용하면, "[Person : ]"이 붙는다.
	}

}
