package com.song.builder;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("发短信！");		
	}

}
