package ru.sertok.spring.hibernate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.sertok.spring.hibernate.models.User;
import ru.sertok.spring.hibernate.repositories.UsersRepository;


@Controller
@RequestMapping(path = "/signUp")
public class SignUpController {

    @Autowired
    private UsersRepository usersRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView get() {
        return new ModelAndView("signUp");
    }

    @RequestMapping(method = RequestMethod.POST)
    public String post(User user) {
        usersRepository.save(user);
        return "redirect:/users";
    }
}
