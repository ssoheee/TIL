package com.sds;

public class LTV implements TV {
	
	private int size;
	private Speaker speaker;

	public LTV() {
		System.out.println("LTV Construct");
	}

	
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public Speaker getSpeaker() {
		return speaker;
	}


	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}


	public void turnOn() {
		System.out.println("LTV ON");
	}

	public void turnOff() {
		System.out.println("LTV OFF");
	}

	@Override
	public void up() {
		speaker.up();
	}


	@Override
	public String toString() {
		return "LTV [size=" + size + ", speaker=" + speaker + "]";
	}
	
}
