package com.song.facade;

public class Computer {
	
	private Cpu cpu;
	private Disk disk;
	private Memory memory;
	
	public Computer() {
		this.cpu = new Cpu();
		this.disk = new Disk();
		this.memory = new Memory();
	}
	
	public void startUp() {
		System.out.println("启动前...");
		cpu.startUp();
		disk.startUp();
		memory.startUp();
		System.out.println("启动后...");
	}
	
	public void shutDown() {
		System.out.println("关闭前...");
		cpu.shutDown();
		disk.shutDown();
		memory.shutDown();
		System.out.println("关闭后...");
	} 

}
