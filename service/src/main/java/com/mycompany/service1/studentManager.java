/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service1;


import com.mycompany.dao1.Address;
import com.mycompany.dao1.Grade;
import com.mycompany.dao1.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author celos
 */
//Hello World
@Component
public class studentManager {
  
//autowired class Student, Address, Grade 
@Autowired
private Student st;

@Autowired
private Address add;

@Autowired
private Grade gra;

//get data method
public void getdata(){
System.out.println("\n"+st.toString());
System.out.println(add.toString());
System.out.println(gra.toString());

}

      public static void main(String[] args) {
     //get bean studentManager     
        ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
     
        studentManager manager = (studentManager)context.getBean("studentManager");
        manager.getdata();
    }
}
