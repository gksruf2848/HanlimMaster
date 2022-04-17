package org.tain.test01.sample05;

import org.tain.test01.common.Car;
import org.tain.test01.common.Tv;

public class TestMain {

	public static void main(String[] args) {
		
		ChildProduct<?, ?, ?> product = null;
		
		product = new ChildProduct<>(new Car("만결숭이의 차"), "BMW", "BMW");
		System.out.println(">>> " + product);
		
		product = new ChildProduct<>(new Tv("만결숭이의 티비"), "GalaxyTV", "Samsung");
		System.out.println(">>> " + product);
		
		
//		아래와 같이 와일드 카드에 Car나 Tv 형태를 넣는 것은 불가능하다.
//		StorageImpl<?> storage = null;
//		
//		storage = new StorageImpl<>("Car_Storage");
//		storage.add(new Car("만결숭이의 첫 번째 차"));
//		storage.add(new Car("만결숭이의 두 번째 차"));
		
		StorageImpl<Car> carStorage = new StorageImpl<>("Car_Storage");
		carStorage.add(new Car("만결숭이의 첫 번째 차"));
		carStorage.add(new Car("만결숭이의 두 번째 차"));
		carStorage.add(new Car("만결숭이의 세 번째 차를 살 수 있을까요?"));
		System.out.println(">>> " + carStorage);
		
		StorageImpl<Tv> tvStorage = new StorageImpl<>("Tv_Storage");
		tvStorage.add(new Tv("만결숭이의 삼성 티비"));
		tvStorage.add(new Tv("만결숭이의 엘지 티비"));
		tvStorage.add(new Tv("하냥이의 창문 티비"));
		tvStorage.add(new Tv("장난감 티비"));
		System.out.println(">>> " + tvStorage);
		
	}
	
}
