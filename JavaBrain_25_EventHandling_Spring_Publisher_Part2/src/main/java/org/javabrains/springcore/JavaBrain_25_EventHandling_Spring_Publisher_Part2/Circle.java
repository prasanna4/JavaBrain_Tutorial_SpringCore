package org.javabrains.springcore.JavaBrain_25_EventHandling_Spring_Publisher_Part2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

@Controller
public class Circle implements Shape,ApplicationEventPublisherAware {

	
	private Point center;
	@Autowired
    private MessageSource messageSource;
	
	
    private ApplicationEventPublisher publisher;
	public MessageSource getMessageSource() {
		return messageSource;
	}





	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	

	public Point getCenter() {
		return center;
	}




	
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}


	@Override
	public void draw() {

	  //System.out.println("Circle Point is : ( "+center.getX()+" , "+center.getY()+" ) ");	
	   
		System.out.println(this.messageSource.getMessage("greetings", null, "Default message", null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(),center.getY()}, "Default message", null));
        DrawEvent drawevent=new DrawEvent(this);
		publisher.publishEvent(drawevent);
	}





	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
      this.publisher=applicationEventPublisher;		
	}





	







}
