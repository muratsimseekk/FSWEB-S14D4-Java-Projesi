package com.workintech.product;

public class Bread extends ProductForSale{

    private double mass;
    public Bread(String type, double price, String description,double mass) {
        super(type, price, description);
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    @Override
    public void showDetails() {
        System.out.println("*********************");
        System.out.println("Bread Details :");
        System.out.println("Type :" + getType());
        System.out.println("Price :" + getPrice());
        System.out.println("Description :" + getDescription());
        System.out.println("Kg : " + getMass());
        System.out.println("*********************");
    }
}
