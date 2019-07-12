package br.com.study.pattern.visitor.factory;

public class AnimalCachorroFactory implements AbstractAnimalFactory {

	@Override
	public Animal createAnimal() {
		
		return new Cachorro();
	}

}
