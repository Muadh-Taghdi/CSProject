package com.store.electronicstore;

class Fridge extends Appliance{

    private double cubicFeet;
    private boolean hasFreezer;

    Fridge(double price, int quantity, int wattage, String color, String brand, double cubicFeet, boolean freezer){
        super(price, quantity, wattage, color, brand);
        this.cubicFeet = cubicFeet;
        this.hasFreezer = freezer;
    }

    double getCubicFeet(){
        return this.cubicFeet;
    }
    boolean isFreezer(){
        return this.hasFreezer;
    }

    @Override
    public String toString(){
        //5. 23.0 cu. ft. Sub Zero com.store.electronicstore.Fridge with Freezer (Stainless Steel, 125 watts) (750.0 dollars each, 10 in stock, 0 sold)
        String freezer = "";
        if(this.isFreezer()){
            freezer = "with Freezer ";
        }
        return this.getCubicFeet()+" cu. ft. " +
                super.getBrand() + " " + freezer +
                super.toString();
    }
}

