package org.javabrains.springcore.JavaBrain_25_EventHandling_Spring_Publisher_Part2;


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
    	//System.out.println(context.getMessage("greetings", null, "Default message", null));
    	
    }
}
