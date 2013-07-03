package com.amitgaur.sample.app.controller;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 7/3/13
 * Time: 8:57 AM
 * To change this template use File | Settings | File Templates.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MediatorController {

    @RequestMapping
    public String getHomePage() {
        return "redirect:/users";
    }
}