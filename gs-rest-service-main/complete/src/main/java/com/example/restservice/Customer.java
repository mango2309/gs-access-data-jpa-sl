package com.example.accessingdatajpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long customerId;  // Renombrado de 'id' a 'customerId'
    private String givenName;  // Renombrado de 'firstName' a 'givenName'
    private String familyName; // Renombrado de 'lastName' a 'familyName'

    protected Customer() {}

    public Customer(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer details -> ID: %d, Name: %s %s",
                customerId, givenName, familyName); // Formato modificado
    }

    public Long getCustomerId() {  // Getter renombrado de 'getId' a 'getCustomerId'
        return customerId;
    }


