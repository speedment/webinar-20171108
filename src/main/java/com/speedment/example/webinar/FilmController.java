package com.speedment.example.webinar;

import com.speedment.example.webinar.db.sakila.sakila.film.Film;
import com.speedment.example.webinar.db.sakila.sakila.film.FilmManager;
import com.speedment.plugins.json.JsonComponent;
import com.speedment.plugins.json.JsonEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Emil Forslund
 * @since 1.0.0
 */
@RestController
public class FilmController {

    @Autowired FilmManager films;
    @Autowired JsonComponent json;

    @GetMapping(path="films", produces = "application/json")
    String getFilmCount() {
        JsonEncoder<Film> encoder = json.of(films,
            Film.TITLE,
            Film.RATING
        );

        return films.stream()
            .filter(Film.LENGTH.greaterThan(40))
            .filter(Film.RATING.equal(Film.Rating.PG13))
            .collect(encoder.collector());
    }

}
