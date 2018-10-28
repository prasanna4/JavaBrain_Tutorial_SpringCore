package org.javabrains.springcore.JavaBrain_11_Bean_AutoWiring;


public class Triangle {
   
private Point pointA;
private Point pointB;
private Point pointC;





public Point getPointA() {
	return pointA;
}





public void setPointA(Point pointA) {
	this.pointA = pointA;
}





public Point getPointB() {
	return pointB;
}





public void setPointB(Point pointB) {
	this.pointB = pointB;
}





public Point getPointC() {
	return pointC;
}





public void setPointC(Point pointC) {
	this.pointC = pointC;
}





public void draw() {
    
    	System.out.println("List Point: ("+getPointA().getX()+" , "+getPointA().getY()+")");
    	System.out.println("List Point: ("+getPointB().getX()+" , "+getPointB().getY()+")");
    	System.out.println("List Point: ("+getPointC().getX()+" , "+getPointC().getY()+")");

 }
}
