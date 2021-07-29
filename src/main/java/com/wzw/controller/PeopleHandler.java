package com.wzw.controller;

import com.wzw.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wei
 * @Date 2021/7/30
 */
@Controller
@RequestMapping("/people")
public class PeopleHandler {

    @Autowired
    private PeopleService peopleService;

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", peopleService.findAll());
        return modelAndView;
    }
}
