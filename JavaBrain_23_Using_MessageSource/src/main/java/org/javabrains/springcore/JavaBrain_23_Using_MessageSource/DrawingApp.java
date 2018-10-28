package org.javabrains.springcore.JavaBrain_23_Using_MessageSource;


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
    	System.out.println(context.getMessage("greetings", null, "Default message", null));
    	
    }
}
