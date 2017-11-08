package com.speedment.example.webinar.db.sakila.sakila.language.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.webinar.db.sakila.sakila.language.Language;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.speedment.example.webinar.db.sakila.sakila.language.Language}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedLanguageImpl implements Language {
    
    private short languageId;
    private String name;
    private Timestamp lastUpdate;
    
    protected GeneratedLanguageImpl() {
        
    }
    
    @Override
    public short getLanguageId() {
        return languageId;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public Language setLanguageId(short languageId) {
        this.languageId = languageId;
        return this;
    }
    
    @Override
    public Language setName(String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public Language setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("languageId = " + Objects.toString(getLanguageId()));
        sj.add("name = "       + Objects.toString(getName()));
        sj.add("lastUpdate = " + Objects.toString(getLastUpdate()));
        return "LanguageImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Language)) { return false; }
        final Language thatLanguage = (Language)that;
        if (this.getLanguageId() != thatLanguage.getLanguageId()) {return false; }
        if (!Objects.equals(this.getName(), thatLanguage.getName())) {return false; }
        if (!Objects.equals(this.getLastUpdate(), thatLanguage.getLastUpdate())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Short.hashCode(getLanguageId());
        hash = 31 * hash + Objects.hashCode(getName());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}