package com.speedment.example.webinar.db.sakila.sakila.film_list.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.webinar.db.sakila.sakila.film_list.FilmList;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;
import java.util.List;
import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.speedment.example.webinar.db.sakila.sakila.film_list.FilmList} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedFilmListManager extends Manager<FilmList> {
    
    List<Field<FilmList>> FIELDS = unmodifiableList(asList(
        FilmList.FID,
        FilmList.TITLE,
        FilmList.DESCRIPTION,
        FilmList.CATEGORY,
        FilmList.PRICE,
        FilmList.LENGTH,
        FilmList.RATING,
        FilmList.ACTORS
    ));
    
    @Override
    default Class<FilmList> getEntityClass() {
        return FilmList.class;
    }
}