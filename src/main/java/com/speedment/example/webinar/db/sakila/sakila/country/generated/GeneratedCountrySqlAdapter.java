package com.speedment.example.webinar.db.sakila.sakila.country.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.common.injector.annotation.WithState;
import com.speedment.example.webinar.db.sakila.sakila.country.Country;
import com.speedment.example.webinar.db.sakila.sakila.country.CountryImpl;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.exception.SpeedmentException;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.speedment.example.webinar.db.sakila.sakila.country.Country} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCountrySqlAdapter {
    
    private final TableIdentifier<Country> tableIdentifier;
    
    protected GeneratedCountrySqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "country");
    }
    
    @ExecuteBefore(RESOLVED)
    void installMethodName(@WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }
    
    protected Country apply(ResultSet resultSet) throws SpeedmentException {
        final Country entity = createEntity();
        try {
            entity.setCountryId(  resultSet.getInt(1)       );
            entity.setCountry(    resultSet.getString(2)    );
            entity.setLastUpdate( resultSet.getTimestamp(3) );
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    protected CountryImpl createEntity() {
        return new CountryImpl();
    }
}