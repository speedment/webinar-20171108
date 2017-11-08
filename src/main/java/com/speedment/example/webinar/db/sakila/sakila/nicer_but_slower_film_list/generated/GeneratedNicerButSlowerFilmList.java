package com.speedment.example.webinar.db.sakila.sakila.nicer_but_slower_film_list.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.webinar.db.sakila.sakila.nicer_but_slower_film_list.NicerButSlowerFilmList;
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
 * com.speedment.example.webinar.db.sakila.sakila.nicer_but_slower_film_list.NicerButSlowerFilmList}-interface
 * representing entities of the {@code nicer_but_slower_film_list}-table in the
 * database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedNicerButSlowerFilmList {
    
    /**
     * This Field corresponds to the {@link NicerButSlowerFilmList} field that
     * can be obtained using the {@link NicerButSlowerFilmList#getFid()} method.
     */
    ComparableField<NicerButSlowerFilmList, Integer, Integer> FID = ComparableField.create(
        Identifier.FID,
        o -> OptionalUtil.unwrap(o.getFid()),
        NicerButSlowerFilmList::setFid,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link NicerButSlowerFilmList} field that
     * can be obtained using the {@link NicerButSlowerFilmList#getTitle()}
     * method.
     */
    StringField<NicerButSlowerFilmList, String> TITLE = StringField.create(
        Identifier.TITLE,
        o -> OptionalUtil.unwrap(o.getTitle()),
        NicerButSlowerFilmList::setTitle,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link NicerButSlowerFilmList} field that
     * can be obtained using the {@link NicerButSlowerFilmList#getDescription()}
     * method.
     */
    StringField<NicerButSlowerFilmList, String> DESCRIPTION = StringField.create(
        Identifier.DESCRIPTION,
        o -> OptionalUtil.unwrap(o.getDescription()),
        NicerButSlowerFilmList::setDescription,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link NicerButSlowerFilmList} field that
     * can be obtained using the {@link NicerButSlowerFilmList#getCategory()}
     * method.
     */
    StringField<NicerButSlowerFilmList, String> CATEGORY = StringField.create(
        Identifier.CATEGORY,
        NicerButSlowerFilmList::getCategory,
        NicerButSlowerFilmList::setCategory,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link NicerButSlowerFilmList} field that
     * can be obtained using the {@link NicerButSlowerFilmList#getPrice()}
     * method.
     */
    ComparableField<NicerButSlowerFilmList, BigDecimal, BigDecimal> PRICE = ComparableField.create(
        Identifier.PRICE,
        o -> OptionalUtil.unwrap(o.getPrice()),
        NicerButSlowerFilmList::setPrice,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link NicerButSlowerFilmList} field that
     * can be obtained using the {@link NicerButSlowerFilmList#getLength()}
     * method.
     */
    ComparableField<NicerButSlowerFilmList, Integer, Integer> LENGTH = ComparableField.create(
        Identifier.LENGTH,
        o -> OptionalUtil.unwrap(o.getLength()),
        NicerButSlowerFilmList::setLength,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link NicerButSlowerFilmList} field that
     * can be obtained using the {@link NicerButSlowerFilmList#getRating()}
     * method.
     */
    StringField<NicerButSlowerFilmList, String> RATING = StringField.create(
        Identifier.RATING,
        o -> OptionalUtil.unwrap(o.getRating()),
        NicerButSlowerFilmList::setRating,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link NicerButSlowerFilmList} field that
     * can be obtained using the {@link NicerButSlowerFilmList#getActors()}
     * method.
     */
    StringField<NicerButSlowerFilmList, String> ACTORS = StringField.create(
        Identifier.ACTORS,
        o -> OptionalUtil.unwrap(o.getActors()),
        NicerButSlowerFilmList::setActors,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the fid of this NicerButSlowerFilmList. The fid field corresponds
     * to the database column sakila.sakila.nicer_but_slower_film_list.FID.
     * 
     * @return the fid of this NicerButSlowerFilmList
     */
    OptionalInt getFid();
    
    /**
     * Returns the title of this NicerButSlowerFilmList. The title field
     * corresponds to the database column
     * sakila.sakila.nicer_but_slower_film_list.title.
     * 
     * @return the title of this NicerButSlowerFilmList
     */
    Optional<String> getTitle();
    
    /**
     * Returns the description of this NicerButSlowerFilmList. The description
     * field corresponds to the database column
     * sakila.sakila.nicer_but_slower_film_list.description.
     * 
     * @return the description of this NicerButSlowerFilmList
     */
    Optional<String> getDescription();
    
    /**
     * Returns the category of this NicerButSlowerFilmList. The category field
     * corresponds to the database column
     * sakila.sakila.nicer_but_slower_film_list.category.
     * 
     * @return the category of this NicerButSlowerFilmList
     */
    String getCategory();
    
    /**
     * Returns the price of this NicerButSlowerFilmList. The price field
     * corresponds to the database column
     * sakila.sakila.nicer_but_slower_film_list.price.
     * 
     * @return the price of this NicerButSlowerFilmList
     */
    Optional<BigDecimal> getPrice();
    
    /**
     * Returns the length of this NicerButSlowerFilmList. The length field
     * corresponds to the database column
     * sakila.sakila.nicer_but_slower_film_list.length.
     * 
     * @return the length of this NicerButSlowerFilmList
     */
    OptionalInt getLength();
    
    /**
     * Returns the rating of this NicerButSlowerFilmList. The rating field
     * corresponds to the database column
     * sakila.sakila.nicer_but_slower_film_list.rating.
     * 
     * @return the rating of this NicerButSlowerFilmList
     */
    Optional<String> getRating();
    
    /**
     * Returns the actors of this NicerButSlowerFilmList. The actors field
     * corresponds to the database column
     * sakila.sakila.nicer_but_slower_film_list.actors.
     * 
     * @return the actors of this NicerButSlowerFilmList
     */
    Optional<String> getActors();
    
    /**
     * Sets the fid of this NicerButSlowerFilmList. The fid field corresponds to
     * the database column sakila.sakila.nicer_but_slower_film_list.FID.
     * 
     * @param fid to set of this NicerButSlowerFilmList
     * @return    this NicerButSlowerFilmList instance
     */
    NicerButSlowerFilmList setFid(Integer fid);
    
    /**
     * Sets the title of this NicerButSlowerFilmList. The title field
     * corresponds to the database column
     * sakila.sakila.nicer_but_slower_film_list.title.
     * 
     * @param title to set of this NicerButSlowerFilmList
     * @return      this NicerButSlowerFilmList instance
     */
    NicerButSlowerFilmList setTitle(String title);
    
    /**
     * Sets the description of this NicerButSlowerFilmList. The description
     * field corresponds to the database column
     * sakila.sakila.nicer_but_slower_film_list.description.
     * 
     * @param description to set of this NicerButSlowerFilmList
     * @return            this NicerButSlowerFilmList instance
     */
    NicerButSlowerFilmList setDescription(String description);
    
    /**
     * Sets the category of this NicerButSlowerFilmList. The category field
     * corresponds to the database column
     * sakila.sakila.nicer_but_slower_film_list.category.
     * 
     * @param category to set of this NicerButSlowerFilmList
     * @return         this NicerButSlowerFilmList instance
     */
    NicerButSlowerFilmList setCategory(String category);
    
    /**
     * Sets the price of this NicerButSlowerFilmList. The price field
     * corresponds to the database column
     * sakila.sakila.nicer_but_slower_film_list.price.
     * 
     * @param price to set of this NicerButSlowerFilmList
     * @return      this NicerButSlowerFilmList instance
     */
    NicerButSlowerFilmList setPrice(BigDecimal price);
    
    /**
     * Sets the length of this NicerButSlowerFilmList. The length field
     * corresponds to the database column
     * sakila.sakila.nicer_but_slower_film_list.length.
     * 
     * @param length to set of this NicerButSlowerFilmList
     * @return       this NicerButSlowerFilmList instance
     */
    NicerButSlowerFilmList setLength(Integer length);
    
    /**
     * Sets the rating of this NicerButSlowerFilmList. The rating field
     * corresponds to the database column
     * sakila.sakila.nicer_but_slower_film_list.rating.
     * 
     * @param rating to set of this NicerButSlowerFilmList
     * @return       this NicerButSlowerFilmList instance
     */
    NicerButSlowerFilmList setRating(String rating);
    
    /**
     * Sets the actors of this NicerButSlowerFilmList. The actors field
     * corresponds to the database column
     * sakila.sakila.nicer_but_slower_film_list.actors.
     * 
     * @param actors to set of this NicerButSlowerFilmList
     * @return       this NicerButSlowerFilmList instance
     */
    NicerButSlowerFilmList setActors(String actors);
    
    enum Identifier implements ColumnIdentifier<NicerButSlowerFilmList> {
        
        FID         ("FID"),
        TITLE       ("title"),
        DESCRIPTION ("description"),
        CATEGORY    ("category"),
        PRICE       ("price"),
        LENGTH      ("length"),
        RATING      ("rating"),
        ACTORS      ("actors");
        
        private final String columnName;
        private final TableIdentifier<NicerButSlowerFilmList> tableIdentifier;
        
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
            return "nicer_but_slower_film_list";
        }
        
        @Override
        public String getColumnName() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<NicerButSlowerFilmList> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}