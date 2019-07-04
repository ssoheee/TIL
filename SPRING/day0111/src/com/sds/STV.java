package com.sds;

public class STV implements TV {

	private int size;
	private Speaker speaker;
	
	public STV() {
		System.out.println("STV Construct");
	}
	
	public STV(int size) {
		this.size = size;
	}

	public STV(Speaker speaker) {
		this.speaker = speaker;
	}

	public STV(int size, Speaker speaker) {
		this.size = size;
		this.speaker = speaker;
	}

	public void turnOn() {
		System.out.println("STV ON");
	}

	public void turnOff() {
		System.out.println("STV OFF");
	}

	@Override
	public void up() {
		speaker.up();
	}

	@Override
	public String toString() {
		return "STV [size=" + size + "]";
	}

}
