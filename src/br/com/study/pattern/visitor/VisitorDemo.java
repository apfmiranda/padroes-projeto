package br.com.study.pattern.visitor;

import java.util.ArrayList;

public class VisitorDemo {

	public static void main(String args[]) {
		// normal shopping cart stuff
		ArrayList<Product> items = new ArrayList<Product>();
		
		items.add(new Book(9.0, 0.200));
		items.add(new CD(5.0, 0.100));
		items.add(new DVD(7.00, 0.100));

		// create a visitor
		PostageVisitor visitor = new PostageVisitor();
		// iterate through all items
		for (Product item : items) {
			item.accept(visitor);
		}
		double postage = visitor.getTotalPostage();
		double total = visitor.getTotalValueOfCart();
		
		System.out.println("Total postage: " + postage);
		System.out.println("Total Pedido: " + total);

	}

}
