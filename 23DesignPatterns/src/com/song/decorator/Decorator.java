package com.song.decorator;

public class Decorator implements Sourceable{
	
	private Sourceable resource;
	
	Decorator(Sourceable resource) {
		this.resource = resource;
	}
	

	@Override
	public void method() {
		System.out.println("装饰前！");
		resource.method();
		System.out.println("装饰后！");
	}

}
