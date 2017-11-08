package com.speedment.example.webinar.db.sakila.sakila.country.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.webinar.db.sakila.sakila.country.Country;
import com.speedment.example.webinar.db.sakila.sakila.country.CountryManager;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.speedment.example.webinar.db.sakila.sakila.country.Country} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCountryManagerImpl 
extends AbstractManager<Country> 
implements GeneratedCountryManager {
    
    private final TableIdentifier<Country> tableIdentifier;
    
    protected GeneratedCountryManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "country");
    }
    
    @Override
    public TableIdentifier<Country> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Country>> fields() {
        return CountryManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Country>> primaryKeyFields() {
        return Stream.of(
            Country.COUNTRY_ID
        );
    }
}