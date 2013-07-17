package com.amitgaur.sample.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 6/28/13
 * Time: 10:51 PM
 * To change this template use File | Settings | File Templates.
 */
@Document
public class Role {

    @Id
    private String id;

    private Integer role;

    public void setId(String id) {
        this.id = id;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getId() {
        return id;
    }
    public Integer getRole() {
        return role;
    }
}
