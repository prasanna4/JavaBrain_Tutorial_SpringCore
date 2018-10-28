package org.javabrains.springcore.JavaBrain_18_Coding_Interfaces;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class DrawingApp 
{
    public static void main( String[] args )
    {
            
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        //Shape shape=(Shape)context.getBean("circle");
    	Shape shape=(Shape)context.getBean("triangle");
    	shape.draw();
    }
}
