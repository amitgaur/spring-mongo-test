package com.amitgaur.sample.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 7/1/13
 * Time: 5:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Configuration

public class MongoConfig {

    @Bean
    public MongoTemplate getMongoTemplate() {

        return new MongoTemplate(null);
    }

}
