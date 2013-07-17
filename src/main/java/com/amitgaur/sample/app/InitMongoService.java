package com.amitgaur.sample.app;
import java.util.UUID;

import com.amitgaur.sample.app.config.MongoConfig;
import com.amitgaur.sample.app.model.Role;
import com.amitgaur.sample.app.model.User;
import com.amitgaur.sample.app.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Service for initializing MongoDB with sample data using {@link MongoTemplate}
 */
public class InitMongoService {


    private static MongoTemplate mongoTemplate;

    public static void main(String... args) throws  Exception{
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);


        MongoConfig config = ctx.getBean(MongoConfig.class);

        mongoTemplate= config.mongoTemplate();
        // Drop existing collections
        mongoTemplate.dropCollection("role");
        mongoTemplate.dropCollection("user");

        // Create new records
        Role adminRole = new Role();
        adminRole.setId(UUID.randomUUID().toString());
        adminRole.setRole(1);

        Role userRole = new Role();
        userRole.setId(UUID.randomUUID().toString());
        userRole.setRole(2);

        User john = new User();
        john.setId(UUID.randomUUID().toString());
        john.setFirstName("John");
        john.setLastName("Smith");
        john.setPassword(PasswordUtil.generatePassword("imeasy"));
        john.setRole(adminRole);

        User jane = new User();
        jane.setId(UUID.randomUUID().toString());
        jane.setFirstName("Jane");
        jane.setLastName("Adams");
        jane.setPassword(PasswordUtil.generatePassword("imeasier"));
        jane.setRole(userRole);


        // Insert to db
        mongoTemplate.insert(john, "user");
        mongoTemplate.insert(jane, "user");
        mongoTemplate.insert(adminRole, "role");
        mongoTemplate.insert(userRole, "role");
    }
}