package org.javabrains.springcore.JavaBrain_4_UsingConstructor;

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
       //Triangle triangleobj=new Triangle(); 
       //Triangle Drawn
       //spring.xml
       //BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
       
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangleobj=(Triangle)context.getBean("triangle");
        
    	triangleobj.draw();
    }
}
