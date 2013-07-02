package com.amitgaur.sample.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 7/2/13
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@ImportResource("classpath:/mongo-config.xml")
public  class ConnectionConfig {
     @Value("#{mongoconfig.dbName}")public String dbName;
    @Value("#{mongoconfig.dbHost}")public String dbHost;
    @Value("#{mongoconfig.username}")public String userName;
    @Value("#{mongoconfig.password}")public String password;








}
