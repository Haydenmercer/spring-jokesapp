package com.hayden.spring.jokesapp.services;


import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
@Service
public class ChuckNorrisJokeService implements JokeService{

    private final ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
