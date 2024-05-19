package com.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("instr")
@Scope("prototype")
public class instrumtalist {

	String song;
	
	
	Instrument inst;
	
	public instrumtalist() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public instrumtalist(String song, Instrument inst) {
		super();
		this.song = song;
		this.inst = inst;
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
	@Override
	public String toString() {
		return "instrumtalist [song=" + song + ", inst=" + inst + "]";
	}
	public void play() {
		inst.play();
		
	}
	
}
