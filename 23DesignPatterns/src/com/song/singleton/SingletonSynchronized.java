package com.song.singleton;

public class SingletonSynchronized {
	
	//持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载
	private static SingletonSynchronized instance = null;

	//私有构造方法，防止在其他类实例化
	private SingletonSynchronized() {
		
	}
	
	//静态方法创建实例
	public static SingletonSynchronized getInstance() {
		if(instance == null) {
			getInit();
		}
		return instance;
	}
	
	//防止多线程环境下
	public static synchronized void getInit() {
		if(instance == null) {
			instance = new SingletonSynchronized();
		}
	}
}
