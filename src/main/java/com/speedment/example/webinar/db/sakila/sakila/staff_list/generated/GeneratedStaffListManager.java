package com.speedment.example.webinar.db.sakila.sakila.staff_list.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.webinar.db.sakila.sakila.staff_list.StaffList;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;
import java.util.List;
import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.speedment.example.webinar.db.sakila.sakila.staff_list.StaffList} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedStaffListManager extends Manager<StaffList> {
    
    List<Field<StaffList>> FIELDS = unmodifiableList(asList(
        StaffList.ID,
        StaffList.NAME,
        StaffList.ADDRESS,
        StaffList.ZIP_CODE,
        StaffList.PHONE,
        StaffList.CITY,
        StaffList.COUNTRY,
        StaffList.SID
    ));
    
    @Override
    default Class<StaffList> getEntityClass() {
        return StaffList.class;
    }
}