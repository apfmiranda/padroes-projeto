package br.com.study.pattern.visitor.factory.method;

public class FactoryMethodDemo {
	
	private void someMethodThatLogs(AbstractLoggerCreator logCreator){
		Logger logger = logCreator.createLogger();
		logger.log("message");
	}
	
	public static void main(String[] args){
		//for the purposes of this example, create an XMLLoggerCreator directly, 
		//but this would normally be passed to constructor for use.
		AbstractLoggerCreator creator = new XMLLoggerCreator();
		FactoryMethodDemo client = new FactoryMethodDemo();
		
		client.someMethodThatLogs(creator);
	}
}
