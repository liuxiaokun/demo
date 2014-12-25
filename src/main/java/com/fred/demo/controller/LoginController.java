package com.fred.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ModelAndView login(HttpServletResponse response, HttpServletRequest req, String username) {
        System.out.println(req.getParameter("username"));
        ModelAndView mv = new ModelAndView("/result", "command", "LOGIN SUCCESS, " + username);
        return mv;
    }
}