package br.com.study.pattern.visitor;

public class CD extends Product {

	public CD(double price, double weight) {
		super(price, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
