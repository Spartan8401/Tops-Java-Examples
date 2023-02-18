package com.spring.SpringScopeBySingleTone;

import org.springframework.context.ApplicationContext;
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
          ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
          Student s1=(Student)a.getBean("s1");
          
          s1.setId(1);
          s1.setFname("Piyush");
          s1.setLname("Panchal");
          s1.setEmail("prpanchal@gmail.com");
          System.out.println(s1);
          
          Student s2=(Student)a.getBean("s1");
          System.out.println(s2);
          System.out.println("Static SingleTone EE Value Repet EE Copy  kare.");
    }
}
