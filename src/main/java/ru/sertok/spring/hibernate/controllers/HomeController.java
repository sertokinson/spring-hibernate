package ru.sertok.spring.hibernate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping(path = "/home")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView get() {
        return new ModelAndView("home");
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(@RequestParam(name = "redirect",required = false) String redirect) {
        return Optional.ofNullable(redirect).map("redirect:/"::concat).orElse("redirect:/home");
    }
}
