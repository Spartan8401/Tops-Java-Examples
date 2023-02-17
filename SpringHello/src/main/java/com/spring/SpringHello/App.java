package com.spring.SpringHello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
             AbstractApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
             Student s=(Student)a.getBean("s2");
             System.out.println("Sid :"+s.getSid());
             System.out.println("Fname :"+s.getFname());
             System.out.println("Lname :"+s.getLname());
             System.out.println("Email :"+s.getEmail());
             a.registerShutdownHook();
    }
}
