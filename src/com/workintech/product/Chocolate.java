package com.workintech.product;

public class Chocolate extends ProductForSale{

    private double mass ;

    public Chocolate(String type, double price, String description , double mass) {
        super(type, price, description);
        this.mass=mass;
    }

    public double getMass() {
        return mass;
    }

    @Override
    public void showDetails() {
        System.out.println("*********************");
        System.out.println("Chocolate Details :");
        System.out.println("Type :" + getType());
        System.out.println("Price :" + getPrice());
        System.out.println("Description :" + getDescription());
        System.out.println("Kg : " + getMass());
        System.out.println("*********************");
    }
}
