package com.kopylov.project.controller.user;

import com.kopylov.project.entity.User;
import com.kopylov.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String reg(Model model){
        model.addAttribute("user", new User());
        return "nav/registration";
    }

    @RequestMapping(value = "/registration/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute User user){
        this.userService.addUser(user);
        return "nav/index";
    }
}
