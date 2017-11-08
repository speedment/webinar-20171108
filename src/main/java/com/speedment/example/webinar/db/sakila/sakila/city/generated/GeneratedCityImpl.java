package com.speedment.example.webinar.db.sakila.sakila.city.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.webinar.db.sakila.sakila.city.City;
import com.speedment.example.webinar.db.sakila.sakila.country.Country;
import com.speedment.runtime.core.manager.Manager;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.speedment.example.webinar.db.sakila.sakila.city.City}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCityImpl implements City {
    
    private int cityId;
    private String city;
    private int countryId;
    private Timestamp lastUpdate;
    
    protected GeneratedCityImpl() {
        
    }
    
    @Override
    public int getCityId() {
        return cityId;
    }
    
    @Override
    public String getCity() {
        return city;
    }
    
    @Override
    public int getCountryId() {
        return countryId;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public City setCityId(int cityId) {
        this.cityId = cityId;
        return this;
    }
    
    @Override
    public City setCity(String city) {
        this.city = city;
        return this;
    }
    
    @Override
    public City setCountryId(int countryId) {
        this.countryId = countryId;
        return this;
    }
    
    @Override
    public City setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Country findCountryId(Manager<Country> foreignManager) {
        return foreignManager.stream().filter(Country.COUNTRY_ID.equal(getCountryId())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("cityId = "     + Objects.toString(getCityId()));
        sj.add("city = "       + Objects.toString(getCity()));
        sj.add("countryId = "  + Objects.toString(getCountryId()));
        sj.add("lastUpdate = " + Objects.toString(getLastUpdate()));
        return "CityImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof City)) { return false; }
        final City thatCity = (City)that;
        if (this.getCityId() != thatCity.getCityId()) {return false; }
        if (!Objects.equals(this.getCity(), thatCity.getCity())) {return false; }
        if (this.getCountryId() != thatCity.getCountryId()) {return false; }
        if (!Objects.equals(this.getLastUpdate(), thatCity.getLastUpdate())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getCityId());
        hash = 31 * hash + Objects.hashCode(getCity());
        hash = 31 * hash + Integer.hashCode(getCountryId());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}