package org.javabrains.springcore.JavaBrain_23_Using_MessageSource_Inside_Bean;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class Circle implements Shape {

	
	private Point center;
	@Autowired
    private MessageSource messageSource;
	
    
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

	}

}
