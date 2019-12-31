package com.projetEbilleterie.ebilleterie.domain.rate;

public class Rate {

    //Attributs
    private String id;
    private String name;
    private double PRICE_EXTERNAL_ADULT;
    private int QUANTITY_PRICE_EXTERNAL_ADULT;
    private double PRICE_EXTERNAL_CHILD;
    private int QUANTITY_PRICE_EXTERNAL_CHILD;
    private double PRICE_INTERNAL_ADULT;
    private int QUANTITY_PRICE_INTERNAL_ADULT;
    private double PRICE_INTERNAL_CHILD;
    private int QUANTITY_PRICE_INTERNAL_CHILD;
    private double PRICE_EXTERNAL_UNIQUE;
    private int QUANTITY_PRICE_EXTERNAL_UNIQUE;
    private double PRICE_INTERNAL_UNIQUE;
    private int QUANTITY_PRICE_INTERNAL_UNIQUE;

    // Constructors
    public Rate() {}

    public Rate(String id, String name,double PRICE_EXTERNAL_ADULT, int QUANTITY_PRICE_EXTERNAL_ADULT, double PRICE_EXTERNAL_CHILD,
                int QUANTITY_PRICE_EXTERNAL_CHILD, double PRICE_INTERNAL_ADULT, int QUANTITY_PRICE_INTERNAL_ADULT,
                double PRICE_INTERNAL_CHILD, int QUANTITY_PRICE_INTERNAL_CHILD, double PRICE_EXTERNAL_UNIQUE,
                int QUANTITY_PRICE_EXTERNAL_UNIQUE, double PRICE_INTERNAL_UNIQUE, int QUANTITY_PRICE_INTERNAL_UNIQUE) {
        this.id = id;
        this.name = name;
        this.PRICE_EXTERNAL_ADULT = PRICE_EXTERNAL_ADULT;
        this.QUANTITY_PRICE_EXTERNAL_ADULT = QUANTITY_PRICE_EXTERNAL_ADULT;
        this.PRICE_EXTERNAL_CHILD = PRICE_EXTERNAL_CHILD;
        this.QUANTITY_PRICE_EXTERNAL_CHILD = QUANTITY_PRICE_EXTERNAL_CHILD;
        this.PRICE_INTERNAL_ADULT = PRICE_INTERNAL_ADULT;
        this.QUANTITY_PRICE_INTERNAL_ADULT = QUANTITY_PRICE_INTERNAL_ADULT;
        this.PRICE_INTERNAL_CHILD = PRICE_INTERNAL_CHILD;
        this.QUANTITY_PRICE_INTERNAL_CHILD = QUANTITY_PRICE_INTERNAL_CHILD;
        this.PRICE_EXTERNAL_UNIQUE = PRICE_EXTERNAL_UNIQUE;
        this.QUANTITY_PRICE_EXTERNAL_UNIQUE = QUANTITY_PRICE_EXTERNAL_UNIQUE;
        this.PRICE_INTERNAL_UNIQUE = PRICE_INTERNAL_UNIQUE;
        this.QUANTITY_PRICE_INTERNAL_UNIQUE = QUANTITY_PRICE_INTERNAL_UNIQUE;
    }

    // Getter
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPRICE_EXTERNAL_ADULT() {return PRICE_EXTERNAL_ADULT;}
    public int getQUANTITY_PRICE_EXTERNAL_ADULT() {return QUANTITY_PRICE_EXTERNAL_ADULT;}
    public double getPRICE_EXTERNAL_CHILD() {return PRICE_EXTERNAL_CHILD;}
    public int getQUANTITY_PRICE_EXTERNAL_CHILD() {return QUANTITY_PRICE_EXTERNAL_CHILD;}
    public double getPRICE_INTERNAL_ADULT() {return PRICE_INTERNAL_ADULT;}
    public int getQUANTITY_PRICE_INTERNAL_ADULT() {return QUANTITY_PRICE_INTERNAL_ADULT;}
    public double getPRICE_INTERNAL_CHILD() {return PRICE_INTERNAL_CHILD;}
    public int getQUANTITY_PRICE_INTERNAL_CHILD() {return QUANTITY_PRICE_INTERNAL_CHILD;}
    public double getPRICE_EXTERNAL_UNIQUE() {return PRICE_EXTERNAL_UNIQUE;}
    public int getQUANTITY_PRICE_EXTERNAL_UNIQUE() {return QUANTITY_PRICE_EXTERNAL_UNIQUE;}
    public double getPRICE_INTERNAL_UNIQUE() {return PRICE_INTERNAL_UNIQUE;}
    public int getQUANTITY_PRICE_INTERNAL_UNIQUE() {return QUANTITY_PRICE_INTERNAL_UNIQUE;}
}