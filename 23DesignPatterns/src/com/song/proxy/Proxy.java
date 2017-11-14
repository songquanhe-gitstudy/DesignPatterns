package com.song.proxy;


public class Proxy implements Sourable{

	private Resource resource;
	
	public Proxy() {
		this.resource = new Resource();
	}
	
	@Override
	public void method() {
		before();
		resource.method();
		after();
	}
	
	private void before() {
		System.out.println("代理前！");
	}

	private void after() {
		System.out.println("代理后！");
	}

}
