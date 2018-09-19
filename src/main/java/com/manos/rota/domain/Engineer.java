package com.manos.rota.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by manoskammas on 13/09/2018.
 */
public class Engineer {

    private long id;
    private String name;
    private BigInteger wallet;
    private Map<String,Boolean> availability;

    public Engineer(String name){
        this.name=name;
        this.availability = new HashMap();
    }

    public int getAvailabilitySize(){
        return this.availability.size();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getWallet() {
        return wallet;
    }

    public void setWallet(BigInteger wallet) {
        this.wallet = wallet;
    }

    public Map<String, Boolean> getAvailability() {
        return availability;
    }

    public void setAvailability(Map<String, Boolean> availability) {
        this.availability = availability;
    }
}
