package com.speedment.example.webinar.db.sakila.sakila.sales_by_film_category.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.webinar.db.sakila.sakila.sales_by_film_category.SalesByFilmCategory;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import java.math.BigDecimal;
import java.util.Optional;

/**
 * The generated base for the {@link
 * com.speedment.example.webinar.db.sakila.sakila.sales_by_film_category.SalesByFilmCategory}-interface
 * representing entities of the {@code sales_by_film_category}-table in the
 * database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedSalesByFilmCategory {
    
    /**
     * This Field corresponds to the {@link SalesByFilmCategory} field that can
     * be obtained using the {@link SalesByFilmCategory#getCategory()} method.
     */
    StringField<SalesByFilmCategory, String> CATEGORY = StringField.create(
        Identifier.CATEGORY,
        SalesByFilmCategory::getCategory,
        SalesByFilmCategory::setCategory,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link SalesByFilmCategory} field that can
     * be obtained using the {@link SalesByFilmCategory#getTotalSales()} method.
     */
    ComparableField<SalesByFilmCategory, BigDecimal, BigDecimal> TOTAL_SALES = ComparableField.create(
        Identifier.TOTAL_SALES,
        o -> OptionalUtil.unwrap(o.getTotalSales()),
        SalesByFilmCategory::setTotalSales,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the category of this SalesByFilmCategory. The category field
     * corresponds to the database column
     * sakila.sakila.sales_by_film_category.category.
     * 
     * @return the category of this SalesByFilmCategory
     */
    String getCategory();
    
    /**
     * Returns the totalSales of this SalesByFilmCategory. The totalSales field
     * corresponds to the database column
     * sakila.sakila.sales_by_film_category.total_sales.
     * 
     * @return the totalSales of this SalesByFilmCategory
     */
    Optional<BigDecimal> getTotalSales();
    
    /**
     * Sets the category of this SalesByFilmCategory. The category field
     * corresponds to the database column
     * sakila.sakila.sales_by_film_category.category.
     * 
     * @param category to set of this SalesByFilmCategory
     * @return         this SalesByFilmCategory instance
     */
    SalesByFilmCategory setCategory(String category);
    
    /**
     * Sets the totalSales of this SalesByFilmCategory. The totalSales field
     * corresponds to the database column
     * sakila.sakila.sales_by_film_category.total_sales.
     * 
     * @param totalSales to set of this SalesByFilmCategory
     * @return           this SalesByFilmCategory instance
     */
    SalesByFilmCategory setTotalSales(BigDecimal totalSales);
    
    enum Identifier implements ColumnIdentifier<SalesByFilmCategory> {
        
        CATEGORY    ("category"),
        TOTAL_SALES ("total_sales");
        
        private final String columnName;
        private final TableIdentifier<SalesByFilmCategory> tableIdentifier;
        
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
            return "sales_by_film_category";
        }
        
        @Override
        public String getColumnName() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<SalesByFilmCategory> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}