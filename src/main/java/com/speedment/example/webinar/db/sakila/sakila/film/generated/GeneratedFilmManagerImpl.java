package com.speedment.example.webinar.db.sakila.sakila.film.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.webinar.db.sakila.sakila.film.Film;
import com.speedment.example.webinar.db.sakila.sakila.film.FilmManager;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.speedment.example.webinar.db.sakila.sakila.film.Film} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmManagerImpl 
extends AbstractManager<Film> 
implements GeneratedFilmManager {
    
    private final TableIdentifier<Film> tableIdentifier;
    
    protected GeneratedFilmManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "film");
    }
    
    @Override
    public TableIdentifier<Film> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Film>> fields() {
        return FilmManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Film>> primaryKeyFields() {
        return Stream.of(
            Film.FILM_ID
        );
    }
}