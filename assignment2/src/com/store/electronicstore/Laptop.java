package com.store.electronicstore;

class Laptop extends Computer {

    private double screenSize;

    Laptop(double price, int quantity, double cpuSpeed, int ram, boolean ssd, int storage, double screenSize) {
        super(price, quantity, cpuSpeed, ram, ssd, storage);
        this.screenSize = screenSize;
    }

    double getScreenSize(){
        return this.screenSize;
    }

    @Override
    public String toString() {
        return this.getScreenSize() + " inch com.store.electronicstore.Laptop PC " + super.toString();
    }
}
