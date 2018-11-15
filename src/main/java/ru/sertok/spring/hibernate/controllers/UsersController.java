package ru.sertok.spring.hibernate.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.sertok.spring.hibernate.repositories.UsersRepository;

import java.util.Optional;

@Controller
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public ModelAndView getUsers() {
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("users", usersRepository.findAll());
        return modelAndView;
    }

    @RequestMapping(path = "/users/{id}", method = RequestMethod.GET)
    public ModelAndView getUser(@PathVariable("id") Long id) {
        ModelAndView modelAndView = new ModelAndView("users");
        Optional.ofNullable(usersRepository.findAllById(id)).ifPresent(user -> modelAndView.addObject("users", user));
        return modelAndView;
    }
}
