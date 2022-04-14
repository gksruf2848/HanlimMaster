package org.tain.test01.sample05;

public class ChildProduct<T, M, C> extends Product<T, M> {
	
	private C company;
	
	public ChildProduct(T type, M model, C company) {
		super(type, model);
		this.company = company;
	}
	
	public C getCompany() { return this.company; }
	
	public String toString() {
		return String.format("[ChildProduct : %s, %s, %s]", super.getType(), super.getModel(), this.company);
	}

}
