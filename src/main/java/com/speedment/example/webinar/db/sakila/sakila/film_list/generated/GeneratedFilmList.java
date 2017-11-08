package com.speedment.example.webinar.db.sakila.sakila.film_list.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.webinar.db.sakila.sakila.film_list.FilmList;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import java.math.BigDecimal;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * com.speedment.example.webinar.db.sakila.sakila.film_list.FilmList}-interface
 * representing entities of the {@code film_list}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedFilmList {
    
    /**
     * This Field corresponds to the {@link FilmList} field that can be obtained
     * using the {@link FilmList#getFid()} method.
     */
    ComparableField<FilmList, Integer, Integer> FID = ComparableField.create(
        Identifier.FID,
        o -> OptionalUtil.unwrap(o.getFid()),
        FilmList::setFid,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmList} field that can be obtained
     * using the {@link FilmList#getTitle()} method.
     */
    StringField<FilmList, String> TITLE = StringField.create(
        Identifier.TITLE,
        o -> OptionalUtil.unwrap(o.getTitle()),
        FilmList::setTitle,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmList} field that can be obtained
     * using the {@link FilmList#getDescription()} method.
     */
    StringField<FilmList, String> DESCRIPTION = StringField.create(
        Identifier.DESCRIPTION,
        o -> OptionalUtil.unwrap(o.getDescription()),
        FilmList::setDescription,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmList} field that can be obtained
     * using the {@link FilmList#getCategory()} method.
     */
    StringField<FilmList, String> CATEGORY = StringField.create(
        Identifier.CATEGORY,
        FilmList::getCategory,
        FilmList::setCategory,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmList} field that can be obtained
     * using the {@link FilmList#getPrice()} method.
     */
    ComparableField<FilmList, BigDecimal, BigDecimal> PRICE = ComparableField.create(
        Identifier.PRICE,
        o -> OptionalUtil.unwrap(o.getPrice()),
        FilmList::setPrice,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmList} field that can be obtained
     * using the {@link FilmList#getLength()} method.
     */
    ComparableField<FilmList, Integer, Integer> LENGTH = ComparableField.create(
        Identifier.LENGTH,
        o -> OptionalUtil.unwrap(o.getLength()),
        FilmList::setLength,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmList} field that can be obtained
     * using the {@link FilmList#getRating()} method.
     */
    StringField<FilmList, String> RATING = StringField.create(
        Identifier.RATING,
        o -> OptionalUtil.unwrap(o.getRating()),
        FilmList::setRating,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmList} field that can be obtained
     * using the {@link FilmList#getActors()} method.
     */
    StringField<FilmList, String> ACTORS = StringField.create(
        Identifier.ACTORS,
        o -> OptionalUtil.unwrap(o.getActors()),
        FilmList::setActors,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the fid of this FilmList. The fid field corresponds to the
     * database column sakila.sakila.film_list.FID.
     * 
     * @return the fid of this FilmList
     */
    OptionalInt getFid();
    
    /**
     * Returns the title of this FilmList. The title field corresponds to the
     * database column sakila.sakila.film_list.title.
     * 
     * @return the title of this FilmList
     */
    Optional<String> getTitle();
    
    /**
     * Returns the description of this FilmList. The description field
     * corresponds to the database column sakila.sakila.film_list.description.
     * 
     * @return the description of this FilmList
     */
    Optional<String> getDescription();
    
    /**
     * Returns the category of this FilmList. The category field corresponds to
     * the database column sakila.sakila.film_list.category.
     * 
     * @return the category of this FilmList
     */
    String getCategory();
    
    /**
     * Returns the price of this FilmList. The price field corresponds to the
     * database column sakila.sakila.film_list.price.
     * 
     * @return the price of this FilmList
     */
    Optional<BigDecimal> getPrice();
    
    /**
     * Returns the length of this FilmList. The length field corresponds to the
     * database column sakila.sakila.film_list.length.
     * 
     * @return the length of this FilmList
     */
    OptionalInt getLength();
    
    /**
     * Returns the rating of this FilmList. The rating field corresponds to the
     * database column sakila.sakila.film_list.rating.
     * 
     * @return the rating of this FilmList
     */
    Optional<String> getRating();
    
    /**
     * Returns the actors of this FilmList. The actors field corresponds to the
     * database column sakila.sakila.film_list.actors.
     * 
     * @return the actors of this FilmList
     */
    Optional<String> getActors();
    
    /**
     * Sets the fid of this FilmList. The fid field corresponds to the database
     * column sakila.sakila.film_list.FID.
     * 
     * @param fid to set of this FilmList
     * @return    this FilmList instance
     */
    FilmList setFid(Integer fid);
    
    /**
     * Sets the title of this FilmList. The title field corresponds to the
     * database column sakila.sakila.film_list.title.
     * 
     * @param title to set of this FilmList
     * @return      this FilmList instance
     */
    FilmList setTitle(String title);
    
    /**
     * Sets the description of this FilmList. The description field corresponds
     * to the database column sakila.sakila.film_list.description.
     * 
     * @param description to set of this FilmList
     * @return            this FilmList instance
     */
    FilmList setDescription(String description);
    
    /**
     * Sets the category of this FilmList. The category field corresponds to the
     * database column sakila.sakila.film_list.category.
     * 
     * @param category to set of this FilmList
     * @return         this FilmList instance
     */
    FilmList setCategory(String category);
    
    /**
     * Sets the price of this FilmList. The price field corresponds to the
     * database column sakila.sakila.film_list.price.
     * 
     * @param price to set of this FilmList
     * @return      this FilmList instance
     */
    FilmList setPrice(BigDecimal price);
    
    /**
     * Sets the length of this FilmList. The length field corresponds to the
     * database column sakila.sakila.film_list.length.
     * 
     * @param length to set of this FilmList
     * @return       this FilmList instance
     */
    FilmList setLength(Integer length);
    
    /**
     * Sets the rating of this FilmList. The rating field corresponds to the
     * database column sakila.sakila.film_list.rating.
     * 
     * @param rating to set of this FilmList
     * @return       this FilmList instance
     */
    FilmList setRating(String rating);
    
    /**
     * Sets the actors of this FilmList. The actors field corresponds to the
     * database column sakila.sakila.film_list.actors.
     * 
     * @param actors to set of this FilmList
     * @return       this FilmList instance
     */
    FilmList setActors(String actors);
    
    enum Identifier implements ColumnIdentifier<FilmList> {
        
        FID         ("FID"),
        TITLE       ("title"),
        DESCRIPTION ("description"),
        CATEGORY    ("category"),
        PRICE       ("price"),
        LENGTH      ("length"),
        RATING      ("rating"),
        ACTORS      ("actors");
        
        private final String columnName;
        private final TableIdentifier<FilmList> tableIdentifier;
        
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
            return "film_list";
        }
        
        @Override
        public String getColumnName() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<FilmList> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}