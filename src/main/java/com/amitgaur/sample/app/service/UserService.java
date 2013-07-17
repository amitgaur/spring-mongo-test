package com.amitgaur.sample.app.service;

import com.amitgaur.sample.app.model.User;
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

    private static final Logger logger = Logger.getLogger(UserService.class.getName());

    public List<User> getAll() {

        List<User> users =  userRepository.findAll();


        logger.info("Users retrieved size is " + users.size());
        for (User user : users) {
            logger.info("User is " + user);
        }
        return users;

    }

    public User getByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
    public User getById(String id) {
        return userRepository.findOne(id);
    }

    public Boolean create(User user) {
        User exists = userRepository.findByUserName(user.getUserName());
        if (exists != null) {
            return false;
        }
        User savedUser = userRepository.save(user);
        if (savedUser == null) {
            return false;
        }
        return true;
    }

    public Boolean update(User user) {
        User exists = userRepository.findByUserName(user.getUserName());
        if (exists != null) {
            return false;
        }

        exists.setFirstName(user.getFirstName());
        exists.setLastName(user.getLastName());
        exists.setEmail(user.getEmail());
        exists.setRole(user.getRole());

        User updated = userRepository.save(exists);
        if (updated == null) {
            return false;
        }
        return true;
    }

    public Boolean delete(String userId) {
        User exists = userRepository.findOne(userId);
        if (exists != null) {
            userRepository.delete(exists);
            return true;
        }

        return false;

    }
}
