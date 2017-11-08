package com.speedment.example.webinar;

import com.speedment.example.webinar.db.sakila.sakila.film.Film;
import com.speedment.example.webinar.db.sakila.sakila.film.FilmManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Emil Forslund
 * @since 1.0.0
 */
@RestController
public class FilmController {

    @Autowired FilmManager films;

    @GetMapping("films")
    List<Film> getFilmCount() {
        return films.stream()
            .filter(Film.LENGTH.greaterThan(40))
            .filter(Film.RATING.equal(Film.Rating.PG13))
            .collect(Collectors.toList());
    }

}
