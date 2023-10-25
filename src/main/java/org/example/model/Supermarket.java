package org.example.model;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Supermarket {
    private final String name;
    private final String baseUrl;
    private final Map<Product, String> urls;
    private final Map<Product, Float> prices;


    public Supermarket(String name, String baseUrl){
        this.name = name;
        this.baseUrl = baseUrl;
        this.urls = new HashMap<>();
        this.prices = new HashMap<>();
    }

    public void put(Product product, String url){
        urls.put(product, url);
        prices.put(product, Float.NaN);
    }

    public String getName(){
        return name;
    }

    public String getBaseUrl(){
        return baseUrl;
    }
}
