package com.song.adapter;

public class ObjectAdapter implements ObjectBaseInterface{
	
	private ObjectResource resource;
	
	public ObjectAdapter(ObjectResource resource) {
		this.resource = resource;
	}

	@Override
	public void method1() {
		resource.method1();
		
	}

	@Override
	public void method2() {
		System.out.println("接口中的方法2！");
		
	}
	
	

}
