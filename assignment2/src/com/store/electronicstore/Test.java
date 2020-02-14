package com.store.electronicstore;

public class Test extends ElectronicStore {

    public static void print(String str){
        System.out.println(str);
    }

    public static void test_1(){
        ElectronicStore electronicStoreObj = new ElectronicStore("Ahmad Store");
        Product productObj = new Product(15.0,1);
        productObj.toString();
        System.out.println(productObj.toString());
        assert electronicStoreObj.addProduct(productObj) == true: "things is going south here at test_1";
    }
    public static void test_2(){
        Product [] productsArray = new Product[10];
        for(int i = 0; i < productsArray.length; i++){
            //System.out.println(productsArray[i]);
            //productsArray[i] = new com.store.electronicstore.Product();
            //System.out.println(productsArray[i]);
        }
    }
    public static void test_3(){
        Computer computerObj = new Computer(13,4,5,16,true,2);
        System.out.println(computerObj.toString());
        Desktop dtObj = new Desktop(13,4,5,16,true,2, "Compact");
        System.out.println(dtObj.toString());
    }
    public static void test_4(){
        Desktop d1 = new Desktop(500, 11, 3.0, 16, false, 250, "Compact");
        System.out.println(d1.toString());
        System.out.println(d1.sellUnits(3));
        System.out.println(d1.toString());
        System.out.println(d1.sellUnits(3));
        System.out.println(d1.toString());
    }
    public static void test_6(){
        ElectronicStore store1 = new ElectronicStore("Ohm-y Goodness Electronics");
        Desktop d1 = new Desktop(175, 10, 3.0, 16, true, 250, "Low-Profile");
        Desktop d2 = new Desktop(150, 15, 3.5, 32, false, 1000, "Standard");
        Laptop l1 = new Laptop(350, 5, 3.5, 16, true, 500, 16);
        Laptop l2 = new Laptop(500, 5, 2.5, 8, true, 125, 13);
        Fridge f1 = new Fridge(250, 5, 250, "Black", "Sub Zero", 12, false);
        Fridge f2 = new Fridge(275, 5, 125, "White", "Sub Zero", 15, false);
        ToasterOven t1 = new ToasterOven(30, 10, 50, "Graphite", "Danby", 8, false);
        ToasterOven t2 = new ToasterOven(80, 10, 50, "Red", "Toasty", 12, true);
        Desktop d3 = new Desktop(175, 10, 3.0, 16, true, 250, "Low-Profile");
        Desktop d4 = new Desktop(150, 15, 3.5, 32, false, 1000, "Standard");
        Laptop l3 = new Laptop(350, 5, 3.5, 16, true, 500, 16);
        Laptop l4 = new Laptop(500, 5, 2.5, 8, true, 125, 13);
        Fridge f3 = new Fridge(250, 5, 250, "Black", "Sub Zero", 12, false);
        Fridge f4 = new Fridge(275, 5, 125, "White", "Sub Zero", 15, false);
        ToasterOven t3 = new ToasterOven(30, 10, 50, "Graphite", "Danby", 8, false);
        ToasterOven t4 = new ToasterOven(80, 10, 50, "Red", "Toasty", 12, true);
        store1.addProduct(d1);
        store1.addProduct(d2);
        store1.addProduct(l1);
        store1.addProduct(l2);
        store1.addProduct(f1);
        store1.addProduct(f2);
        store1.addProduct(t1);
        store1.addProduct(t2);
        store1.addProduct(d3);
        store1.addProduct(d4);
        store1.addProduct(l3);
        store1.addProduct(l4);
        store1.addProduct(f3);
        store1.addProduct(f4);
        store1.addProduct(t3);
        store1.addProduct(t4);


        //store1.printStock();
        //store1.getRevenue();
        //System.out.println("store1.getRevenue() = "+store1.getRevenue());
        //store1.sellProducts(9,11);
        //store1.printStock();
        //System.out.println("store1.getRevenue() = "+store1.getRevenue());
        store1.sellProducts();


    }


    public static void main(String[] args){
        test_6();

    }
}
