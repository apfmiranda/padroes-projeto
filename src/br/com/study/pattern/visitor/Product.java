package br.com.study.pattern.visitor;

public abstract class Product {
	
	private double price;
	private double weight;
	
	public abstract void accept(Visitor visitor);
	
	public Product(double price, double weight) {
		super();
		this.price = price;
		this.weight = weight;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}


}
