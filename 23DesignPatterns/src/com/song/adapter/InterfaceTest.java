package com.song.adapter;

public class InterfaceTest {
	public static void main(String[] args) {
		InterfaceResource1 resource1 = new InterfaceResource1();
		InterfaceResource2 resource2 = new InterfaceResource2();
		
		resource1.method1();
		resource1.method2();
		resource2.method2();
		resource2.method1();
		
	}

}
