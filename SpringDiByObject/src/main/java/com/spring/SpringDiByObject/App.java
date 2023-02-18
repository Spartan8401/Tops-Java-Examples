package com.spring.SpringDiByObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Person;
import com.bean.Phone;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
    	Person p=(Person)a.getBean("person");
        p.PhoneCall();
    }
}
