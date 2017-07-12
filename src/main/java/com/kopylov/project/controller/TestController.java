package com.kopylov.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getMain(Model model){
        return "nav/index";
    }

    @RequestMapping(value="/admin", method = RequestMethod.GET)
    public String getAdminPage(){
        return "admin/index";
    }
}
