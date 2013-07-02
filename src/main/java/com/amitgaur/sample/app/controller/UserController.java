package com.amitgaur.sample.app.controller;

import com.amitgaur.sample.app.dto.UserListDTO;
import com.amitgaur.sample.app.service.UserService;
import com.amitgaur.sample.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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

    @RequestMapping("/index")
    public @ResponseBody
    UserListDTO getUsers() {

        return new UserListDTO(userService.getAll());
    }



}
