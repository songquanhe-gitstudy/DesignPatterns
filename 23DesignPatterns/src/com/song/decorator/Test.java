package com.song.decorator;

public class Test {

	public static void main(String[] args) {
		Sourceable resource = new Resource();
		Sourceable decorator = new Decorator(resource);
		decorator.method();
	}
}
