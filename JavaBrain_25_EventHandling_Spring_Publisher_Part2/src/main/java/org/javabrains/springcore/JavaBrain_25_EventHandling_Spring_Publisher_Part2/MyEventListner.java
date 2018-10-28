package org.javabrains.springcore.JavaBrain_25_EventHandling_Spring_Publisher_Part2;

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
