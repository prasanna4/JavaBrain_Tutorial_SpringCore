package org.javabrains.springcore.JavaBrain_22_Component_Annotations;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {

	
	private Point center;
	
	

	public Point getCenter() {
		return center;
	}




	
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}


	@Override
	public void draw() {

	  System.out.println("Circle Point is : ( "+center.getX()+" , "+center.getY()+" ) ");	
	  
	}

}
