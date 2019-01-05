package com.netcracker.injectingtypes.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("injectingtypes-config.xml");
        Book dictionary = (Book) context.getBean("dictionary");
        Book novel = (Book) context.getBean("novel");

        System.out.println("The book title is " + dictionary.getTitle());
        System.out.println("Pages --> " + dictionary.getPages());
        dictionary.getPublisher().publish();

        System.out.println();

        System.out.println("The book title is " + novel.getTitle());
        System.out.println("Pages --> " + novel.getPages());
        novel.getPublisher().publish();

        System.out.println();

        dictionary.read();
        novel.read();
    }
}
