package org.javabrains.springcore.JavaBrain_24_EventHandling_Spring_Part1;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListner implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
      System.out.println("eventName="+event.toString());		
	}

}
