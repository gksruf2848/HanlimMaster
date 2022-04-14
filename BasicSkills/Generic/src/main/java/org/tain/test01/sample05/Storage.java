package org.tain.test01.sample05;

public interface Storage<T> {
	
	public void add(T type);
	public T get(int index);

}
