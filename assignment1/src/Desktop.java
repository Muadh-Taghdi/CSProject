public class Desktop {
    double CPU;
    int RAM;
    int storage;
    boolean SSD;

    public Desktop(){
    }

    public Desktop(double initCPU, int initRAM, int initStorage, boolean initSSD){
        CPU = initCPU;
        RAM = initRAM;
        storage = initStorage;
        SSD = initSSD;
    }
    public String toString(){
        String storageType;
        storageType = "SSD";
        if(!SSD){storageType = "HDD";}
        return "Desktop PC with " + CPU + "ghz CPU, " + RAM + "GB RM, " + storage + "GB " + storageType + " drive";
    }
}
