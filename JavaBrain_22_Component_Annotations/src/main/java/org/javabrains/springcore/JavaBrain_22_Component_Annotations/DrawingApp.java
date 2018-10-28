package org.javabrains.springcore.JavaBrain_22_Component_Annotations;


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
    	Shape shape=(Shape)context.getBean("circle");
    	shape.draw();
    	
    }
}
