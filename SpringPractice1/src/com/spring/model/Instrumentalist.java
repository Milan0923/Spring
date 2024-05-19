package com.spring.model;

public class Instrumentalist {

	String song;
	Instrument inst;

	public Instrumentalist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getSong() {
		return song;
	}


	public void setSong(String song) {
		this.song = song;
	}


	public Instrument getInst() {
		return inst;
	}


	public void setInst(Instrument inst) {
		this.inst = inst;
	}


	public Instrumentalist(String song, Instrument inst) {
		super();
		this.song = song;
		this.inst = inst;
	}


	@Override
	public String toString() {
		return "Instrumentalist [song=" + song + "]";
	}


	public void perform(){
		SOP("Instrumentalist plays "+song);
		inst.play();
	}


	private void SOP(String string) {
		// TODO Auto-generated method stub
		
	}

}
