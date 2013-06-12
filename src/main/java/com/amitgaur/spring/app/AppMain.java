package com.amitgaur.spring.app;

import com.amitgaur.spring.app.config.AppConfig;
import com.amitgaur.test.model.Person;
import com.amitgaur.test.model.PersonFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

public class AppMain {

    public static void main(String... args ){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MongoOperations operations = (MongoOperations)context.getBean("mongoTemplate");

        PersonFactory personFactory = (PersonFactory)context.getBean("personFactory");

       Person p =  personFactory.buildPerson("Amit", "Gaur", "125 Clayton St", "Apt 12", "SF", "94117", "USA");

        operations.save(p);
    }


}