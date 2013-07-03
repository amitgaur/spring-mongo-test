package com.amitgaur.sample.app.service;

import com.amitgaur.sample.app.model.User;
import com.amitgaur.sample.app.repo.RoleRepository;
import com.amitgaur.sample.app.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 7/1/13
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    private static final Logger logger = Logger.getLogger(UserService.class.getName());
    public List<User> getAll() {

        List<User> users =  userRepository.findAll();


        logger.info("Users retrieved size is " + users.size());
        for (User user : users) {
            logger.info("User is " + user);
        }
        return users;

    }
}
