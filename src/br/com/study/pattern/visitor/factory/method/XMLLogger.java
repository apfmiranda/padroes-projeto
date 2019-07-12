package br.com.study.pattern.visitor.factory.method;

public class XMLLogger implements Logger {

	@Override
	public void log(String message) {
		System.err.println("logging");

	}

}
