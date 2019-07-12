package br.com.study.pattern.visitor.factory.method;

public class XMLLoggerCreator extends AbstractLoggerCreator {

	@Override
	Logger createLogger() {
		XMLLogger logger = new XMLLogger();
		return logger;
	}

}
