package com.speedment.example.webinar.db.sakila.sakila.sales_by_film_category.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.webinar.db.sakila.sakila.sales_by_film_category.SalesByFilmCategory;
import com.speedment.runtime.core.util.OptionalUtil;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.speedment.example.webinar.db.sakila.sakila.sales_by_film_category.SalesByFilmCategory}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedSalesByFilmCategoryImpl implements SalesByFilmCategory {
    
    private String category;
    private BigDecimal totalSales;
    
    protected GeneratedSalesByFilmCategoryImpl() {
        
    }
    
    @Override
    public String getCategory() {
        return category;
    }
    
    @Override
    public Optional<BigDecimal> getTotalSales() {
        return Optional.ofNullable(totalSales);
    }
    
    @Override
    public SalesByFilmCategory setCategory(String category) {
        this.category = category;
        return this;
    }
    
    @Override
    public SalesByFilmCategory setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("category = "   + Objects.toString(getCategory()));
        sj.add("totalSales = " + Objects.toString(OptionalUtil.unwrap(getTotalSales())));
        return "SalesByFilmCategoryImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof SalesByFilmCategory)) { return false; }
        final SalesByFilmCategory thatSalesByFilmCategory = (SalesByFilmCategory)that;
        if (!Objects.equals(this.getCategory(), thatSalesByFilmCategory.getCategory())) {return false; }
        if (!Objects.equals(this.getTotalSales(), thatSalesByFilmCategory.getTotalSales())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getCategory());
        hash = 31 * hash + Objects.hashCode(getTotalSales());
        return hash;
    }
}