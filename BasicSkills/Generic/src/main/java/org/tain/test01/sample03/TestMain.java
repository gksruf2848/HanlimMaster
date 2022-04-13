package org.tain.test01.sample03;

import org.tain.test01.common.Car;
import org.tain.test01.common.Tv;

public class TestMain {

	public static void main(String[] args) {
		
		testBoxing();
		System.out.println();
		
		testPairing();
		System.out.println();
		
		testEquals();		
		testCompare();
		
	}
	
	public static void testBoxing() {
		
		Box<?> box = null; //box 변수 하나로
		
		box = new Box<>(new Car("만결숭이의 차")); //Car 타입도 넣을 수 있고,
		System.out.println(">>>>> box : " + box); 
		
		box = new Box<>(new Tv("만결숭이의 티비")); //Tv 타입도 넣을 수 있다.
		System.out.println(">>>>> box : " + box);
		
		box = Util.boxing("이런 식으로 넣을 수도 있어요."); //만들어 놓은 클래스를 이용 할 수도 있다.
		System.out.println(">>>>> box : " + box);
		
	}
	
	public static void testPairing() {
		
		Pair<?, ?> pair = null;
		
		pair = new Pair<>(19970328, "만결숭이 생일"); 
		System.out.println(">>>>> pair : " + pair);
		
		pair = new Pair<>("만결숭이의 차", new Car("BMW"));
		System.out.println(">>>>> pair : " + pair);
		
		pair = Util.pairing("만결숭이의 티비", new Tv("samsung"));
		System.out.println(">>>>> pair : " + pair);
		
	}
	
	public static void testEquals() {
		
		Pair<?, ?> p1 = null;
		Pair<?, ?> p2 = null;
		
		p1 = Util.pairing("Kia", new Car("K5"));
		p2 = Util.pairing("Kia", new Car("K55"));
		
		putEquals(p1, p2);
		
		p1 = Util.pairing(19970328, "만결숭이 생일");
		p2 = Util.pairing(19970328, "만결숭이 생일");
		
		putEquals(p1, p2);
		
	}
	
	public static void testCompare() {
		
		int x = 0;
		double y = 0;
		
		x = 10;
		y = 15.5;
		
		putCompare(x, y);
		
		x = -5;
		y = -5.1;
		
		putCompare(x, y);
		
		x = 3;
		y = 3.0;
		
		putCompare(x, y);
		
	}
	
	public static void putEquals(Pair<?, ?> p1, Pair<?, ?> p2) { //와일드카드를 썼기 때문에 앞에 < , >를 안 붙여도 된다 !
		
		if(Util.equals(p1, p2)) {
			System.out.println(">>> 두 값이 정확히 일치합니다 !");
			System.out.println(">>> 값 정보 : " + p1);
			System.out.println();
		} else {
			System.out.println(">>> 뭔가 달라요 !");
			System.out.println(">>> 값1 정보 : " + p1);
			System.out.println(">>> 값2 정보 : " + p2);
			System.out.println();
		}
		
	}
	
	public static <T extends Number>void putCompare(T type1, T type2) {
		
		if(Util.Compare(type1 , type2) == 0) {
			System.out.println(">>>>> 두 값이 정확히 일치합니다 !");
			System.out.println(">>>>> 값 정보 : " + type1);
			System.out.println();
		} else if(Util.Compare(type1, type2) > 0) {
			System.out.println(">>>>> " + type2 + "보다 " + type1 + "가 더 큽니다 !");
			System.out.println();
		} else {
			System.out.println(">>>>> " + type2 + "보다 " + type1 + "가 더 작습니다 !");
			System.out.println();
		}
	}
	
}
