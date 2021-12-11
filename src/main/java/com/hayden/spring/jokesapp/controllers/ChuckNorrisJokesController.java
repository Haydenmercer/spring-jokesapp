package com.hayden.spring.jokesapp.controllers;

import com.hayden.spring.jokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChuckNorrisJokesController {

    private final JokeService jokeService;

    public ChuckNorrisJokesController(JokeService service){ //qualifier not required if there is only one implementation
        this.jokeService = service;
    }

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String getJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }

}
