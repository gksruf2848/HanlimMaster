package org.tain.test01.sample03;

public class Pair<K, V> {

	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() { return this.key; }
	public V getValue() { return this.value; }
	
	public String toString() {
		return String.format("[Pair : %s, %s]", this.key, this.value);
	}
	
}
