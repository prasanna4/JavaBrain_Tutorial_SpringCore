package org.javabrains.springcore.JavaBrain_21_Resource_Annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	
	private Point center;
	
	

	public Point getCenter() {
		return center;
	}


//    @Resource(name="pointC")
//	public void setCenter(Point center) {
//		this.center = center;
//	}

	
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}


	@Override
	public void draw() {

	  System.out.println("Circle Point is : ( "+center.getX()+" , "+center.getY()+" ) ");	
	  
	}

}
