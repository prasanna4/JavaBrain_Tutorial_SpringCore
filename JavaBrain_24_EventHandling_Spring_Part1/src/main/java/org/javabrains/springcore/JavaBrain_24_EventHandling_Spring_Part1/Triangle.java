package org.javabrains.springcore.JavaBrain_24_EventHandling_Spring_Part1;


public class Triangle implements Shape{
   
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
	   System.out.println("Triangle draw called");
	   
	   System.out.println(" Point A= ("+getPointA().getX()+ " , " +getPointA().getY()+")");
	   System.out.println(" Point B= ("+getPointB().getX()+ " , " +getPointB().getY()+")");
	   System.out.println(" Point C= ("+getPointC().getX()+ " , " +getPointC().getY()+")");

   }
}
