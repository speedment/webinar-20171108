package com.speedment.example.webinar.db.sakila.sakila.rental.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.webinar.db.sakila.sakila.rental.Rental;
import com.speedment.example.webinar.db.sakila.sakila.rental.RentalManager;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.speedment.example.webinar.db.sakila.sakila.rental.Rental} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedRentalManagerImpl 
extends AbstractManager<Rental> 
implements GeneratedRentalManager {
    
    private final TableIdentifier<Rental> tableIdentifier;
    
    protected GeneratedRentalManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "rental");
    }
    
    @Override
    public TableIdentifier<Rental> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Rental>> fields() {
        return RentalManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Rental>> primaryKeyFields() {
        return Stream.of(
            Rental.RENTAL_ID
        );
    }
}