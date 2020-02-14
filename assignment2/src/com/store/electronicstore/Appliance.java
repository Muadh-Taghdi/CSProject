package com.store.electronicstore;

public class Appliance extends Product {
    private int wattage;
    private String color;
    private String brand;

    Appliance(double price, int quantity, int wattage, String color, String brand){
        super(price, quantity);
        this.wattage = wattage;
        this.color = color;
        this.brand = brand;
    }
    int getWattage(){
        return this.wattage;
    }
    String getColor(){
        return this.color;
    }
    String getBrand(){
        return this.brand;
    }

    @Override
    public String toString() {
        //5. 23.0 cu. ft. Sub Zero com.store.electronicstore.Fridge with Freezer (Stainless Steel, 125 watts) (750.0 dollars each, 10 in stock, 0 sold)
        return "("+
                this.getColor() + ", " +
                this.getWattage() + " watts) " +
                super.toString();
    }
}
