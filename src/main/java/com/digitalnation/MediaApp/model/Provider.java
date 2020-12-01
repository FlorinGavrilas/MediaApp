package com.digitalnation.MediaApp.model;

import javax.persistence.Entity;

@Entity
public class Provider extends BaseEntity {
    private Double rating;

    public Provider(String name, String surname, String eMailAddress, String telephoneNumber, Double rating) {
        super(name, surname, eMailAddress, telephoneNumber);
        this.rating = rating;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
