package com.projetEbilleterie.ebilleterie.domain.rate;

import com.projetEbilleterie.ebilleterie.domain.eticket.TypePrice;

public class Rate {

    //Attributs
    private String id;
    private String name;
    private double price;
    private int quantity;
    private TypePrice typePrice;


    // Constructors
    public Rate() {}

    public Rate(String id, String name,double price, int quantity, TypePrice typePrice) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.typePrice = typePrice;
    }

    // Getter
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() {return price; }
    public int getQuantity() {return quantity;}
    public TypePrice getTypePrice() {return typePrice;}
}
