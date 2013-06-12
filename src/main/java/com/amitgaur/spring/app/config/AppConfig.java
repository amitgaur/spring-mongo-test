package com.amitgaur.spring.app.config;

import com.amitgaur.test.model.PersonFactory;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 6/10/13
 * Time: 10:38 PM
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class AppConfig {

    public @Bean
    MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(new MongoClient(), "testapp");
    }

    public @Bean
    MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }

    public @Bean
    PersonFactory personFactory() {

        return new PersonFactory();
    }
}
