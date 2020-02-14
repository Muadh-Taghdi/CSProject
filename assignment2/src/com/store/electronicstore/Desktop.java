package com.store.electronicstore;

public class Desktop extends Computer{

    private String profile;

    Desktop(double price, int quantity, double cpuSpeed, int ram, boolean ssd, int storage, String profile){
        super(price, quantity, cpuSpeed, ram, ssd, storage);
        this.profile = profile;
    }


    //3. String toString() – returns a string representing the desktop.
    // This should summarize the state of the desktop, including each
    // attribute. See the example output included at the bottom for examples.

    String getProfile(){
        return this.profile;
    }

    @Override
    public String toString(){
        return this.getProfile() + " com.store.electronicstore.Desktop PC " + super.toString();
    }

}
