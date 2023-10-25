package org.example.model;

public class Product {
    private String barCode;
    private String name;
    //private float price;



    public Product(String barCode, String name){
        this.barCode = barCode;
        this.name = name;
    }

    public String getBarCode(){
        return barCode;
    }

    public String getName(){
        return name;
    }
}
