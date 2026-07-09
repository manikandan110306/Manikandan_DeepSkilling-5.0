package com.example.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.Service.BookService;

import static org.junit.Assert.*;

public class DemoApplicationTests {

    @Test
    public void testApplicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        assertNotNull("Application context should not be null", context);
    }

    @Test
    public void testBookServiceBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = (BookService) context.getBean("bookService");
        assertNotNull("BookService bean should not be null", service);
    }

}
