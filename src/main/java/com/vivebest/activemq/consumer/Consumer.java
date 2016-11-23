package com.vivebest.activemq.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	public static void main(String[] args) {  
        try {  
            @SuppressWarnings("resource")
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:application.xml" });  
            context.start();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
