package com.song.facade;


/**
 * 外观模式
 * @author 16385
 *
 */
public class UserTest {
	
	public static void main(String [] args) {
		Computer computer = new Computer();
		computer.startUp();
		computer.shutDown();
	}

}
