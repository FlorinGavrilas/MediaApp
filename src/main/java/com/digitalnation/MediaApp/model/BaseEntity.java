package com.digitalnation.MediaApp.model;

import javax.persistence.Entity;

@Entity
public class BaseEntity extends EntityWithID {
    
    private String name;
    private String surname;
    private String eMailAddress;
    private String telephoneNumber;

    public BaseEntity() {}

    public BaseEntity(String name, String surname, String eMailAddress, String telephoneNumber) {
        this.name = name;
        this.surname = surname;
        this.eMailAddress = eMailAddress;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public void seteMailAddress(String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
