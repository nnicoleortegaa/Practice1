package org.example;

import org.example.model.Product;
import org.example.model.Supermarket;

import java.util.List;


public class Main {
    public static void main(String[] args){
        List<Supermarket> supermarkets = createSuperMarkets();
        List<Product> products = createProducts();
        for (Supermarket supermarket : supermarkets){
            fillSuperMarket(supermarket, products);
        }
    }

    private static void fillSuperMarket(Supermarket supermarket, List<Product> products){

    }

    private static List<Supermarket> createSuperMarkets(){
        //TODO
        return List.of();
    }

    private static List<Product> createProducts(){
        //TODO
        return List.of();
    }
}

