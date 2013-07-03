package com.amitgaur.sample.app.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.sun.xml.internal.ws.api.PropertySet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 7/1/13
 * Time: 5:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Configuration

@PropertySource("classpath:/mongo.properties")
public class MongoConfig {

    @Resource
    private Environment environment;
    @Bean
    public MongoTemplate mongoTemplate() throws Exception{

        String dbHost=environment.getProperty("dbHost");
        String dbPort = environment.getProperty("dbPort");
        String dbName  = environment.getProperty("dbName");
        return new MongoTemplate(new SimpleMongoDbFactory(new MongoClient(dbHost,Integer.parseInt(dbPort)),dbName));
    }


}
