package org.javabrains.springcore.JavaBrain_25_EventHandling_Spring_Publisher_Part2;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent{

	public DrawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DrawEvent [source=" + source + "]";
	}

	
	
}
