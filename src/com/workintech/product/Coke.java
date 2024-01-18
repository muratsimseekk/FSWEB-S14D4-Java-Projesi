package com.workintech.product;

public class Coke extends ProductForSale{

    private double calory;
    public Coke(String type, double price, String description , double calory) {
        super(type, price, description);
        this.calory=calory;
    }

    public double getCalory() {
        return calory;
    }

    @Override
    public void showDetails() {
        System.out.println("*********************");
        System.out.println("Coke Details :");
        System.out.println("Type :" + getType());
        System.out.println("Price :" + getPrice());
        System.out.println("Description :" + getDescription());
        System.out.println("Kg : " + getCalory());
        System.out.println("*********************");
    }
}
