package org.javabrains.springcore.JavaBrain_1_SpringDemo;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

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
    	
    	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Triangle triangleobj=(Triangle)factory.getBean("triangle");
        
    	triangleobj.draw();
    }
}
