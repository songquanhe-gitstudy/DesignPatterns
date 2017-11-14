package com.song.builder;

public class MailSender implements Sender{

	@Override
	public void send() {
		System.out.println("邮件发送！");
	}

}
