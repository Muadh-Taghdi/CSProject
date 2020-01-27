public class Laptop {
    double CPU;
    int RAM;
    int storage;
    boolean SSD;
    int screenSize;

    public Laptop(){
    }

    public Laptop(double initCPU, int initRAM, int initStorage, boolean initSSD, int initScreenSize){
        CPU = initCPU;
        RAM = initRAM;
        storage = initStorage;
        SSD = initSSD;
        screenSize = initScreenSize;
    }

    public String toString(){
        String storageType;
        storageType = "SSD";
        if(!SSD){storageType = "HDD";}
        return (screenSize  +  "\" Laptop PC with " + CPU + "ghz CPU, " + RAM + "GB RM, " + storage + "GB " + storageType + " drive");
    }
}

