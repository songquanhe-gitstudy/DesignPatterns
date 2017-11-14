package com.song.decorator;

public class Resource implements Sourceable{
	
	@Override
	public void method() {
		System.out.println("装饰类中的方法！");
	}

}
