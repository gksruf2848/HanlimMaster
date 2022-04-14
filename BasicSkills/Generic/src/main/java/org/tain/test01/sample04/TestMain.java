package org.tain.test01.sample04;

public class TestMain {

	public static void main(String[] args) {
		
		Course<Person> personCourse = new Course<>("일반인 과정");
		personCourse.add(new Person("일반인1"));
		personCourse.add(new Person("직장인1"));
		personCourse.add(new Person("학생1"));
		personCourse.add(new Person("고등학생1"));
		
		Course<Worker> workerCourse = new Course<>("직장인 과정");
		workerCourse.add(new Worker("직장인2"));

		Course<Student> studentCourse = new Course<>("학생 과정");
		studentCourse.add(new Student("학생2"));
		studentCourse.add(new HighStudent("고등학생2"));
		
		Course<HighStudent> highStudentCourse = new Course<>("고등학생 과정");
		highStudentCourse.add(new HighStudent("고등학생3"));
		
		Util.printCourse(personCourse);
		Util.printCourse(workerCourse);
		Util.printCourse(highStudentCourse);
		Util.printCourse(highStudentCourse);
		System.out.println();
		
		//Util.printCourse(personCourse);
		//Util.printCourse(workerCourse);
		Util.printCourseStudent(studentCourse);
		Util.printCourseStudent(highStudentCourse);
		System.out.println();

		
		Util.printCourse(personCourse);
		Util.printCourse(workerCourse);
		//Util.printCourseStudent(studentCourse);
		//Util.printCourseStudent(highStudentCourse);
			
		
	}
	
}
