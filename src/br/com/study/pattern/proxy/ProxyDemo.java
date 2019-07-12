package br.com.study.pattern.proxy;

import java.net.MalformedURLException;
import java.net.URL;

public class ProxyDemo {

	public static void main(String[] args) {
		
		try {
			Image img = new ProxyImage(new URL("https://dzone.com/articles/design-patterns-proxy"));
			img.displayImage();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
