package org.tain.test01.sample01;

import org.tain.test01.common.Car;
import org.tain.test01.common.Tv;

public class TestMain {
	
	public static void main(String[] args) {
		
		Box<Car> box1 = new Box<>(new Car("만결숭이의 차"));
		Box<Tv> box2 = new Box<>(new Tv("만결숭이의 티비"));
	
		Box<?> box3 = new Box<>("이것은 세 번째 박스를 만드려는 만결숭이의 시도");
		Box<?> box4 = new Box<>(new Car("만결숭이 두 번째 차 뽑았다"));
	
	
		System.out.println(">>>>> box1 : " + box1);
		System.out.println(">>>>> car : " + box1.getType());

		System.out.println(">>>>> box2 : " + box2);
		System.out.println(">>>>> tv : " + box2.getType());
	
		System.out.println(">>>>> box3 : " + box3);
		System.out.println(">>>>> box4 : " + box4);
		
		
	}
	
}
