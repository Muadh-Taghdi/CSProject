package com.store.electronicstore;

class Product {
    private double price;
    private int stockQuantity;
    private int soldQuantity;

    Product(double price, int quantity){
        this.price = price;
        this.stockQuantity = quantity;
        this.soldQuantity = 0;

    }

    int getSoldQuantity(){
        return this.soldQuantity;
    }
    int getStockQuantity(){
        return this.stockQuantity;
    }

    double getPrice(){
        return this.price;
    }

    void setPrice(double newPrice){
        this.price = newPrice;
    }

    void setStockQuantity(int newQuantity){
        this.stockQuantity = newQuantity;
    }

    void setSoldQuantity(int amount){
        this.soldQuantity = amount;
    }

    double getRevenue(){
        return this.getSoldQuantity() * this.getPrice();
    }

    /*
    2. double sellUnits(int amount) – simulates selling amount units.
    If there are enough units in stock to meet the request, the quantity
    attributes must be updated appropriately and the total revenue for
    selling (revenue = units * price) should be returned. If there are not
     enough units in stock, no sale should take place and 0.0 should be returned.
     */
    double sellUnits(int amount) {
        double revenue = 0;
        int availableStock = this.getStockQuantity();
        int soldQuantity = this.getSoldQuantity();
        if (amount > 0 && availableStock >= amount){
            revenue = amount * this.getPrice();
            this.setSoldQuantity(soldQuantity + amount);
            this.setStockQuantity(availableStock - amount);
        }
        return revenue;
    }

    @Override
    public String toString() {
        //"(100.0 dollars each, 10 in stock, 0 sold)"
        return  "(" +
                this.getPrice() + " dollars each, " +
                this.getStockQuantity() + " in stock, " +
                this.getSoldQuantity() + " sold)";

    }
}
