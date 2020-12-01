package com.digitalnation.MediaApp.model;

import javax.persistence.Entity;

@Entity
public class ServiceProvided extends EntityWithID {

    private String name;
    private Long idProvider;
    private String description;
    private Double price;

    public ServiceProvided() {}

    public ServiceProvided(String name, Long idProvider, String description, Double price) {
        this.name = name;
        this.idProvider = idProvider;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(Long idProvider) {
        this.idProvider = idProvider;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
