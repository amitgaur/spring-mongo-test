package com.amitgaur.sample.app.controller;

import com.amitgaur.sample.app.dto.UserListDTO;
import com.amitgaur.sample.app.model.User;
import com.amitgaur.sample.app.service.UserService;
import com.amitgaur.sample.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 6/28/13
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    protected static final Logger logger = Logger.getLogger(UserController.class.getName());


    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void handleAllExceptions(Exception ex) {

        logger.log(Level.SEVERE,"Error message");

    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public UserListDTO getUsers() {

        logger.info("User Controller getUsers called");
        return new UserListDTO(userService.getAll());
    }

    @ModelAttribute("allRoles")
    public List<Integer> getAllRoles() {
        List<Integer> roles = new ArrayList<Integer>();
        roles.add(1);
        roles.add(2);
        return roles;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)

    @ResponseBody
    public User get(@PathVariable("id") String id) throws Exception {
        logger.info("Got a request to fetch id : " + id);
        User val = userService.getById(id);

        if (val == null) {
            throw new Exception("Not found");
        }

        return val;
    }


}
