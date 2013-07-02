package com.amitgaur.sample.app.service;

import com.amitgaur.sample.app.model.User;
import com.amitgaur.sample.app.repo.RoleRepository;
import com.amitgaur.sample.app.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 7/1/13
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    public List<User> getAll() {
        return userRepository.findAll();

    }
}
