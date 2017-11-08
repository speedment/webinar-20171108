package com.speedment.example.webinar.db.sakila.sakila.actor_info.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.common.injector.annotation.WithState;
import com.speedment.example.webinar.db.sakila.sakila.actor_info.ActorInfo;
import com.speedment.example.webinar.db.sakila.sakila.actor_info.ActorInfoImpl;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.exception.SpeedmentException;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.speedment.example.webinar.db.sakila.sakila.actor_info.ActorInfo} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedActorInfoSqlAdapter {
    
    private final TableIdentifier<ActorInfo> tableIdentifier;
    
    protected GeneratedActorInfoSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "actor_info");
    }
    
    @ExecuteBefore(RESOLVED)
    void installMethodName(@WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }
    
    protected ActorInfo apply(ResultSet resultSet) throws SpeedmentException {
        final ActorInfo entity = createEntity();
        try {
            entity.setActorId(   resultSet.getInt(1)    );
            entity.setFirstName( resultSet.getString(2) );
            entity.setLastName(  resultSet.getString(3) );
            entity.setFilmInfo(  resultSet.getString(4) );
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    protected ActorInfoImpl createEntity() {
        return new ActorInfoImpl();
    }
}