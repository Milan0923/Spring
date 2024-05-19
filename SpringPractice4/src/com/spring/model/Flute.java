package com.spring.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Flute")
@Scope("prototype")
public class Flute implements Instrument {

	public void play() {
		System.out.println("Flute is playing...");
		
	}
}
