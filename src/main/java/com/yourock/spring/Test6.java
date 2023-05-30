package com.yourock.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        System.out.println("cat1 = cat2 ? " + (cat1 == cat2) + ". cat1 = " + cat1 + "; cat2 = " + cat2);
//        cat.say();

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurName() + " age is " + person.getAge());
//        Person person2 = context.getBean("personBean", Person.class);
//        person.callYourPet();

        context.close();
    }
}
