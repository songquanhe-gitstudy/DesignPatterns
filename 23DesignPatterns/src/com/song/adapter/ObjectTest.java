package com.song.adapter;

public class ObjectTest {
	
	public static void main(String[] args) {
		ObjectBaseInterface adapter = new ObjectAdapter(new ObjectResource());
		adapter.method1();
		adapter.method2();
	}

}
