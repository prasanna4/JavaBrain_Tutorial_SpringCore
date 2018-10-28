package org.javabrains.springcore.JavaBrain_10_Using_Collection_List;

import java.util.List;

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
