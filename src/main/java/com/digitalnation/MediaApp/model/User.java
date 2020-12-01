package com.digitalnation.MediaApp.model;

import javax.persistence.Entity;

@Entity
public class User extends BaseEntity {

    public User() {}

    public User(String name, String surname, String eMailAddress, String telephoneNumber) {
        super(name, surname, eMailAddress, telephoneNumber);
    }
}
