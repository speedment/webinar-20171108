package com.speedment.example.webinar.db.sakila.sakila.store.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.webinar.db.sakila.sakila.address.Address;
import com.speedment.example.webinar.db.sakila.sakila.staff.Staff;
import com.speedment.example.webinar.db.sakila.sakila.store.Store;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.field.ShortField;
import com.speedment.runtime.field.ShortForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;
import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * com.speedment.example.webinar.db.sakila.sakila.store.Store}-interface
 * representing entities of the {@code store}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedStore {
    
    /**
     * This Field corresponds to the {@link Store} field that can be obtained
     * using the {@link Store#getStoreId()} method.
     */
    ShortField<Store, Short> STORE_ID = ShortField.create(
        Identifier.STORE_ID,
        Store::getStoreId,
        Store::setStoreId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Store} field that can be obtained
     * using the {@link Store#getManagerStaffId()} method.
     */
    ShortForeignKeyField<Store, Short, Staff> MANAGER_STAFF_ID = ShortForeignKeyField.create(
        Identifier.MANAGER_STAFF_ID,
        Store::getManagerStaffId,
        Store::setManagerStaffId,
        Staff.STAFF_ID,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Store} field that can be obtained
     * using the {@link Store#getAddressId()} method.
     */
    IntForeignKeyField<Store, Integer, Address> ADDRESS_ID = IntForeignKeyField.create(
        Identifier.ADDRESS_ID,
        Store::getAddressId,
        Store::setAddressId,
        Address.ADDRESS_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link Store} field that can be obtained
     * using the {@link Store#getLastUpdate()} method.
     */
    ComparableField<Store, Timestamp, Timestamp> LAST_UPDATE = ComparableField.create(
        Identifier.LAST_UPDATE,
        Store::getLastUpdate,
        Store::setLastUpdate,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the storeId of this Store. The storeId field corresponds to the
     * database column sakila.sakila.store.store_id.
     * 
     * @return the storeId of this Store
     */
    short getStoreId();
    
    /**
     * Returns the managerStaffId of this Store. The managerStaffId field
     * corresponds to the database column sakila.sakila.store.manager_staff_id.
     * 
     * @return the managerStaffId of this Store
     */
    short getManagerStaffId();
    
    /**
     * Returns the addressId of this Store. The addressId field corresponds to
     * the database column sakila.sakila.store.address_id.
     * 
     * @return the addressId of this Store
     */
    int getAddressId();
    
    /**
     * Returns the lastUpdate of this Store. The lastUpdate field corresponds to
     * the database column sakila.sakila.store.last_update.
     * 
     * @return the lastUpdate of this Store
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the storeId of this Store. The storeId field corresponds to the
     * database column sakila.sakila.store.store_id.
     * 
     * @param storeId to set of this Store
     * @return        this Store instance
     */
    Store setStoreId(short storeId);
    
    /**
     * Sets the managerStaffId of this Store. The managerStaffId field
     * corresponds to the database column sakila.sakila.store.manager_staff_id.
     * 
     * @param managerStaffId to set of this Store
     * @return               this Store instance
     */
    Store setManagerStaffId(short managerStaffId);
    
    /**
     * Sets the addressId of this Store. The addressId field corresponds to the
     * database column sakila.sakila.store.address_id.
     * 
     * @param addressId to set of this Store
     * @return          this Store instance
     */
    Store setAddressId(int addressId);
    
    /**
     * Sets the lastUpdate of this Store. The lastUpdate field corresponds to
     * the database column sakila.sakila.store.last_update.
     * 
     * @param lastUpdate to set of this Store
     * @return           this Store instance
     */
    Store setLastUpdate(Timestamp lastUpdate);
    
    /**
     * Queries the specified manager for the referenced Staff. If no such Staff
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Staff findManagerStaffId(Manager<Staff> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Address. If no such
     * Address exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Address findAddressId(Manager<Address> foreignManager);
    
    enum Identifier implements ColumnIdentifier<Store> {
        
        STORE_ID         ("store_id"),
        MANAGER_STAFF_ID ("manager_staff_id"),
        ADDRESS_ID       ("address_id"),
        LAST_UPDATE      ("last_update");
        
        private final String columnName;
        private final TableIdentifier<Store> tableIdentifier;
        
        Identifier(String columnName) {
            this.columnName      = columnName;
            this.tableIdentifier = TableIdentifier.of(    getDbmsName(), 
                getSchemaName(), 
                getTableName());
        }
        
        @Override
        public String getDbmsName() {
            return "sakila";
        }
        
        @Override
        public String getSchemaName() {
            return "sakila";
        }
        
        @Override
        public String getTableName() {
            return "store";
        }
        
        @Override
        public String getColumnName() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<Store> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}