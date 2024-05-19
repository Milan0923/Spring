package com.spring.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Guitar")
@Scope("prototype")
public class Guitar implements Instrument{

	public void play() {
		System.out.println("Guitar is playing...");
		
	}
}
