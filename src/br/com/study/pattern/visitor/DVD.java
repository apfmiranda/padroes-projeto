package br.com.study.pattern.visitor;

public class DVD extends Product {

	public DVD(double price, double weight) {
		super(price, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

}
