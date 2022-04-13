package org.tain.test01.sample02;

public class Product<T, M> {
	
	private T type;
	private M model;
	
	public Product() { }
	
	public Product(T type, M model) {
		this.type = type;
		this.model = model;
	}
	
	public void setType(T type) { this.type = type; }
	public void setModel(M model) { this.model = model; }
	
	public T getType() { return this.type; }
	public M getModel() { return this.model; }
	
	public String toString() {
		return String.format("[Product : %s, %s]", this.type, this.model);
	}
	
}
