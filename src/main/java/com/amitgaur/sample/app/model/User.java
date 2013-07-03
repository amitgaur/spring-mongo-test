package com.amitgaur.sample.app.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 6/28/13
 * Time: 10:49 PM
 * To change this template use File | Settings | File Templates.
 */
@Document

public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;


    private String userName;
    private String password;

    private String email;

    @org.springframework.data.mongodb.core.mapping.DBRef
    private com.amitgaur.sample.app.model.Role role;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    @Override
    public   String toString() {

        StringBuilder b  = new StringBuilder();

        return b.append(" ID : ").append(id).append( " role :").append(role).toString();
    }
}
