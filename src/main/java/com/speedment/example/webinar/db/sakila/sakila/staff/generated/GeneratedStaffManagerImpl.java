package com.speedment.example.webinar.db.sakila.sakila.staff.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.webinar.db.sakila.sakila.staff.Staff;
import com.speedment.example.webinar.db.sakila.sakila.staff.StaffManager;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.speedment.example.webinar.db.sakila.sakila.staff.Staff} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedStaffManagerImpl 
extends AbstractManager<Staff> 
implements GeneratedStaffManager {
    
    private final TableIdentifier<Staff> tableIdentifier;
    
    protected GeneratedStaffManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "staff");
    }
    
    @Override
    public TableIdentifier<Staff> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Staff>> fields() {
        return StaffManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Staff>> primaryKeyFields() {
        return Stream.of(
            Staff.STAFF_ID
        );
    }
}