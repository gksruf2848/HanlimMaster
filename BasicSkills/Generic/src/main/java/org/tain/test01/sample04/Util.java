package org.tain.test01.sample04;

public class Util {
	
	public static void printCourse(Course<?> course) {
		System.out.println(">>> " + course.getName() + "\t\t" + course.getStudents());
	}
	
	public static void printCourseStudent(Course<? extends Student> course) {
		System.out.println(">>> " + course.getName() + "\t\t" + course.getStudents());
	}
	
	public static void printCourseWorker(Course<? super Worker> course) {
		System.out.println(">>> " + course.getName() + "\t\t" + course.getStudents());
	}

}
