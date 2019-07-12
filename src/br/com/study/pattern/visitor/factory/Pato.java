package br.com.study.pattern.visitor.factory;

public class Pato implements Animal {

	@Override
	public void setType(String type) {
		System.out.println("Eu sou uma ave");

	}

	@Override
	public void move() {
		System.out.println("Eu sei voar");

	}

}
