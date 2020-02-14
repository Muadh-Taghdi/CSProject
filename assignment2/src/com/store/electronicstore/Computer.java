package com.store.electronicstore;

public class Computer extends Product {
    private double cpuSpeed;
    private int ram;
    private boolean ssd;
    private int storage;

    Computer(double price, int quantity, double cpuSpeed, int ram, boolean ssd, int storage){
        super(price, quantity);
        this.cpuSpeed = cpuSpeed;
        this.ram = ram;
        this.ssd = ssd;
        this.storage= storage;

    }
    double getCpuSpeed(){
        return this.cpuSpeed;
    }
    int getRam(){
        return this.ram;
    }
    int getStorage(){
        return this.storage;
    }


    @Override
    public String toString() {
        // 0. Compact com.store.electronicstore.Desktop PC with 3.0ghz CPU, 16GB RAM, 250GB HDD drive.
        return "with " +
                this.getCpuSpeed() + "ghz CPU, " +
                this.getRam() + "GB RAM, " +
                this.getStorage() + "GB HDD drive. " +
                "\n" +
                super.toString();
    }
}
