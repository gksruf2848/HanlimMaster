package org.tain.test01.sample03;

public class Util {

	public static <T> Box<T> boxing(T type) {
		return new Box<>(type);
	}
	
	public static <K, V> Pair<K, V> pairing(K key, V value) {
		return new Pair<>(key, value);
	}
	
	public static <K, V> boolean equals(Pair<?, ?> p1, Pair<?, ?> p2) {
		boolean keyCompare = String.valueOf(p1.getKey()).equals(String.valueOf(p2.getKey()));
		boolean valueCompare = String.valueOf(p1.getValue()).equals(String.valueOf(p2.getValue()));
		return keyCompare && valueCompare;
	}
	
	public static <T extends Number> int Compare(T t1, T t2) {
		double a = t1.doubleValue();
		double b = t2.doubleValue();
		return Double.compare(a, b);
	}
	
}
