public class Desktop {
    double CPU;
    int RAM;
    int storage;
    boolean SSD;

    // zero-argument constructor
    public Desktop(){
    }

    // four-argument constructor
    public Desktop(double initCPU, int initRAM, int initStorage, boolean initSSD){
        CPU = initCPU;
        RAM = initRAM;
        storage = initStorage;
        SSD = initSSD;
    }

    //toString method
    public String toString(){
        String storageType;
        storageType = "SSD";
        if(!SSD){storageType = "HDD";}
        return "Desktop PC with " + CPU + "ghz CPU, " + RAM + "GB RM, " + storage + "GB " + storageType + " drive";
    }
}
