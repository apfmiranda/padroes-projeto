package br.com.study.pattern.visitor;

public class PostageVisitor implements Visitor {
	private double totalPostageForCart;
	private double totalValueOfCart;

	// collect data about the book
	public void visit(Book book) {
		calcPostage(book);
		calcTotalValue(book);
	}

	// add other visitors here
	public void visit(CD cd) {
		calcPostage(cd);
		calcTotalValue(cd);
	}
	
	// add other visitors here
	public void visit(DVD dvd) {
		calcPostage(dvd);
		calcTotalValue(dvd);
	}

	// return the internal state
	public double getTotalPostage() {
		return totalPostageForCart;
	}
	
	public double getTotalValueOfCart() {
		return totalValueOfCart;
	}
	
	private void calcTotalValue(Product prod) {		
		totalValueOfCart += prod.getPrice();		
	}
	
	
	private void calcPostage(Product prod) {
		// assume we have a calculation here related to weight and price
		// free postage for a book over 10
		if (prod.getPrice() < 10.0) {
			totalPostageForCart += prod.getWeight() * 2;
		}
	}

}
