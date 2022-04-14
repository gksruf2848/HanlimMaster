package org.tain.test01.sample04;

import java.util.Vector;

public class Course<T> {
	
	private String name;
	private Vector<T> students;
	
	public Course(String name) {
		this.name = name;
		this.students = new Vector<>();
	}
	
	public String getName() { return this.name; }
	public Vector<T> getStudents() { return this.students; }
	
	public void add(T t) {
		this.students.add(t);
	}

}
