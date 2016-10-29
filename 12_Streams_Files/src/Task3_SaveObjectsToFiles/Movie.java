package Task3_SaveObjectsToFiles;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Movie implements Serializable {

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

    @Override
    public String toString() {
        String object = "Title: " + this.title + "\nDirector: " + this.director + "\nActors:\n";

        for (String actor : actors) {
            object += actor + "\n";
        }
        object += "Rel.Date: " + this.releaseDate;

        return object;
    }
}
