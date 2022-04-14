package org.tain.test01.sample05;

public class Product<T, M> {
	
	private T type;
	private M model;
	
	public Product(T type, M model) {
		this.type = type;
		this.model = model;
	}
	
	public T getType() { return this.type; }
	public M getModel() { return this.model; }
	
	public String toString() {
		return String.format("[Product : %s, %s]", this.type, this.model);
	}

}
