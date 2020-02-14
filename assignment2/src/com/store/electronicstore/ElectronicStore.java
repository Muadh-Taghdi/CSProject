package com.store.electronicstore;

import java.util.Scanner;

public class ElectronicStore {
    private final int MAX_PRODUCTS = 10;
    private String name;
    private double revenue;
    private Product [] products;

    ElectronicStore(){}

    ElectronicStore(String name){
        this.name = name;
        this.revenue = 0;
        this.products = new Product[MAX_PRODUCTS];
    }

    String getName(){
        return this.name;
    }

    /*
    boolean addProduct(com.store.electronicstore.Product p) – if there is space remaining in the products
    array, this method should add p to the products array at the next available
    array slot and return true. If there is no space remaining in the products
    array, this method should just return false.
     */
    boolean addProduct(Product p){
        boolean isFull = false;
        for(int i = 0; i < this.products.length; i++){
            if(this.products[i] == null){
                this.products[i] = p;
                isFull = true;
                break;
            }
        }
        return isFull;
    }
    /*
    void sellProducts() – this method should print out the store’s products (see example
    output below for an idea of how it should look), read an integer from the user representing
    the product to sell (i.e., what index in the products array), and read an integer from
    the user representing how many units of the product to sell. You may assume the user will
    only enter integer numbers but must verify that the values are valid (e.g., a valid item index,
    an amount greater than 0). If the values supplied by the user are valid, the specified
    number of units of the specified product should be sold, if possible. All appropriate
    variables must be updated in all instances (e.g., revenue, number of units in stock, etc.).
    If any of the input is invalid, no sales should take place.
     */
    void sellProducts(){
        this.printStock();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("\nPlease enter an number representing the product to sell from the above list: ");
            int item = input.nextInt();
            if(item == -100){
                break;
            }
            while (!(item >= 0 && item < this.products.length && this.products[item] != null)){
                System.out.println("\nYour entry is invalid, please try again");
                System.out.println("\nPlease enter an intger representing the product to sell from the above list: ");
                item = input.nextInt();

            }
            System.out.println("You entered: " + item);
            System.out.println("You are interested in \n" + this.products[item].toString());
            System.out.println("Please enter the amount of the product to sell: ");
            int amount = input.nextInt();
            if(amount == -100){
                break;
            }
            while(!(amount >= 0)){
                System.out.println("\nYour entry is invalid, please try again ");
                amount = input.nextInt();

            }
            System.out.println("\nYou entered: " + amount);
            this.sellProducts(item, amount);
            System.out.println(this.products[item].toString());
            System.out.println(this.products[item].getRevenue());
            //this.printStock();
            }

    }
    /*
    5. void sellProducts(int item, int amount) – should sell amount units of the product stored at index
    item in the products array, if possible. All appropriate variables must be updated in all
    instances (e.g., revenue, number of units in stock, etc.). If any of the input is invalid,
    no sales should take place.
     */
    void sellProducts(int item, int amount){
        if (item >= 0 && item < this.products.length && this.products[item] != null){
            this.revenue += this.products[item].sellUnits(amount);
        }
    }
    /*
    6. double getRevenue() – returns the total revenue the store has made through sales.
     */
    double getRevenue(){
        return this.revenue;
    }
    /*
    7. void printStock() – should print out the products of the store. See the example
    output at the bottom of the document for examples.
     */
    void printStock(){
        for(int i = 0; i < this.products.length; i++){
            if(this.products[i] != null) {
                System.out.println(i + ". " + this.products[i].toString());
            }
        }

    }

}
