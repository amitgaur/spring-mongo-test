package com.amitgaur.sample.app.dto;

import com.amitgaur.sample.app.model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 7/1/13
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserListDTO {
    List<User> users;
    public UserListDTO(List<User> users) {
       this.users = users;
    }

    public List<User> getUsers() {
        return this.users;
    }
}
