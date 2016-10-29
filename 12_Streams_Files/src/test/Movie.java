package test;

import Task3_SaveObjectsToFiles.*;
import java.time.LocalDate;
import java.util.List;

public class Movie {

    private String title;
    private String director;
    private List<String> actors;
    private LocalDate releaseDate;

    Movie(String title, String director, List<String> actors, LocalDate release) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.releaseDate = release;
    }

    String getTitle()
    {
        return this.title;
    }
    
}
