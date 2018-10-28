package org.javabrains.springcore.JavaBrain_14_Bean_Definition_Inheritance_List;

import java.util.List;

import org.javabrains.springcore.JavaBrain_14_Bean_Definition_Inheritance_List.Point;

public class Triangle {
   
private List<Point> points;



public List<Point> getPoints() {
	return points;
}



public void setPoints(List<Point> points) {
	this.points = points;
}



public void draw() {
	   
	for(Point item:points ) {
    	System.out.println("List Point: ("+item.getX()+" , "+item.getY()+")");
    }
	
   }

}
