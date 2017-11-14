package com.song.singleton;

/**
 * 实际情况是，单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是
 * 线程相斥的。这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，并且会保证把
 * 赋值给instance的内存初始化，这样我们就不用担心上面的问题。通识该方法也只会在 第一次调用的时候使用互斥机制，
 * 这样就解决了低性能问题。这样我们暂时总结一个完美的单例模式：
 * 
 * @author 16385
 *
 */

public class SingletonAnonymous {
	
	private SingletonAnonymous() {
		
	}

	//此处使用一个内部类来维护单例
	private static class SingletonFactory {
		private static SingletonAnonymous instance = new SingletonAnonymous();
	}
	
	//获取实例
	public static SingletonAnonymous getInstance() {
		return SingletonFactory.instance;
	}
	
	//如果该对象被用于序列化，可以保证对象在序列化前后保持一致
	public Object readResolve() {
		return getInstance();
	}
}
