package com.example.moviesuggestionbackend.Entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Question {
    private List<String> countries;
    private List<String> genres;
    private List<String> times;
    private List<String> actors;

    public Question(){
        countries = new ArrayList<>();
        genres = new ArrayList<>();
        times = new ArrayList<>();
        actors = new ArrayList<>();
    }

    public void setAll(){
        countries.add("Statele Unite");
        countries.add("Marea Britanie");
        countries.add("Alta tara");

        genres.add("Actiune");
        genres.add("Drama");

        times.add("Mai mult de 2 ore");
        times.add("Mai putin de 2 ore");

        actors.add("Tom Hardy");
        actors.add("Brad Pitt");
        actors.add("Margot Robbie");
        actors.add("Natalie Portman");


    }
}
