package org.tain.test01.sample02;

import org.tain.test01.common.Car;
import org.tain.test01.common.Tv;

public class TestMain {
	
	public static void main(String[] args) {
		
		Product<?, ?> p1 = new Product<>(new Car("만결숭이의 차"), "람보르기니");
		Product<?, ?> p2 = new Product<>(new Tv("만결숭이의 티비"), "LG");
		
		Product<Car, String> p3 = new Product<>();
		p3.setType(new Car("만결숭이 두 번째 차 뽑았다."));
		p3.setModel("부가티");
		
		
		System.out.println(">>>>> p1 : " + p1);
		System.out.println(">>>>> p2 : " + p2);
		System.out.println(">>>>> p3 : " + p3);
		
	}
	
}
