package org.javabrains.springcore.JavaBrain_6_Inner_Bean;

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
        Triangle triangleobj=(Triangle)context.getBean("triangle");
        
    	triangleobj.draw();
    }
}
