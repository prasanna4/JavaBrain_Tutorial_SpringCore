package org.javabrains.springcore.JavaBrain_8_Idref;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class IDREFMain 
{
    public static void main( String[] args )
    {
    	BeanFactory beanfactory = new ClassPathXmlApplicationContext(
    		    "spring.xml");
    		    AnotherBean bean = (AnotherBean) beanfactory.getBean("another");
    		    bean.display();
   }
}
