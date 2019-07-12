package br.com.study.pattern.visitor;

public class Book extends Product  {

	public Book(double price, double weight) {
		super(price, weight);
		// TODO Auto-generated constructor stub
	}

	// accept the visitor
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
