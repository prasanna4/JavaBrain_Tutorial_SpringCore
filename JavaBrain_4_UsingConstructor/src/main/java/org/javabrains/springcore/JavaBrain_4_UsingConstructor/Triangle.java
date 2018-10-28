package org.javabrains.springcore.JavaBrain_4_UsingConstructor;

public class Triangle {
   
	private String type;
	private int height;
	
	
	public int getHeight() {
		return height;
	}


	


	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}


	public Triangle(int height) {
		super();
		this.height = height;
	}


	//constructor
    public Triangle(String type) {
		super();
		this.type = type;
	}


	public String getType() {
		return type;
	}




public void draw() {
	   System.out.println(getType()+" Triangle Drawn using constructor with height="+getHeight());
   }
}
