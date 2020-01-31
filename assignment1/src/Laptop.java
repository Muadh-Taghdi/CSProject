public class Laptop {
    double CPU;
    int RAM;
    int storage;
    boolean SSD;
    int screenSize;

    //zero-argument constructor
    public Laptop(){
    }

    //five-argument constructor
    public Laptop(double initCPU, int initRAM, int initStorage, boolean initSSD, int initScreenSize){
        CPU = initCPU;
        RAM = initRAM;
        storage = initStorage;
        SSD = initSSD;
        screenSize = initScreenSize;
    }

    //toString method
    public String toString(){
        String storageType;
        storageType = "SSD";
        if(!SSD){storageType = "HDD";}
        return (screenSize  +  "\" Laptop PC with " + CPU + "ghz CPU, " + RAM + "GB RM, " + storage + "GB " + storageType + " drive");
    }
}

