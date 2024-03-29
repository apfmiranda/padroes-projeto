package br.com.study.pattern.proxy;

import java.net.URL;

public class RealImage implements Image {   
	
	public RealImage(URL url) {      
		//load up the image      
		loadImage(url);   
	}   
	
	public void displayImage() {       
		//display the image
		System.out.println("display the image");
	}   
	
	//a method that only the real image has   
	private void loadImage(URL url)  {      
		//do resource intensive operation to load image 
		System.out.println("load image");
	}
}