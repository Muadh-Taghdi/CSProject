package com.store.electronicstore;

class ToasterOven extends Appliance {

    private int width;
    private boolean convection;

    ToasterOven(double price, int quantity, int wattage, String color, String brand, int width, boolean convection){
        super(price, quantity, wattage,color, brand);
        this.width = width;
        this.convection = convection;

    }

    int getWidth(){
        return this.width;
    }
    boolean isConvection(){
        return this.convection;
    }

    @Override
    public String toString() {
        //7. 12 inch Toasty Toaster with convection (Silver, 50 watts) (75.0 dollars each, 10 in stock, 0 sold)
        String convection = "";
        if(this.isConvection()){
            convection = "with convection ";
        }
        return this.getWidth()+" inch " +
                super.getBrand() + " " + convection +
                super.toString();
    }
}
