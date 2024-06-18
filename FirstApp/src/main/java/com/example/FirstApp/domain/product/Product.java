package com.example.FirstApp.domain.product;

import jakarta.persistence.*;

@Entity
@Table

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;

    int priceWithoutTVA;
    int priceWithTva;
    int TVA;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceWithoutTVA() {
        return priceWithoutTVA;
    }

    public void setPriceWithoutTVA(int priceWithoutTVA) {
        this.priceWithoutTVA = priceWithoutTVA;
    }

    public int getPriceWithTva() {
        return priceWithTva;
    }

    public void setPriceWithTva(int priceWithTva) {
        this.priceWithTva = priceWithTva;
    }

    public int getTVA() {
        return TVA;
    }

    public void setTVA(int TVA) {
        this.TVA = TVA;
    }


}
