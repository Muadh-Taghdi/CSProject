import java.util.Random;
public class ElectronicStore {
    String name;
    Desktop[] desktopStock;
    Laptop[] laptopStock;
    Fridge[] fridgeStock;

    // Possible inventory
    static String[] colorValues = {"White", "Black", "Red", "Green", "Blue", "Grey", "Stainless Steel"};
    static int[] ramValues = {4, 6, 8, 16, 32, 64};
    static double[] cpuValues = {2.30, 2.40, 3.20, 2.60, 2.80, 3.10, 1.80, 1.10};
    static int[] storageValues = {200, 250, 300, 400, 500, 550, 700};
    static int[] screenSizeValues = {11, 12, 13, 15, 17};
    static double[] fridgeSizes = {18, 20.4, 11.6, 13.9, 21.6, 28};

    // creating an instance of the random class
    static Random random = new Random();

    // one-argument constructor
    public ElectronicStore(String initName){
        name = initName;
        desktopStock = new Desktop[3];
        for(int i=0; i<desktopStock.length; i++){
            desktopStock[i] = new Desktop(cpuValues[random.nextInt(cpuValues.length)], ramValues[random.nextInt(ramValues.length)], storageValues[random.nextInt(storageValues.length)], random.nextBoolean());
        }
        laptopStock = new Laptop[3];
        for(int i=0; i<laptopStock.length; i++){
            laptopStock[i] = new Laptop(cpuValues[random.nextInt(cpuValues.length)], ramValues[random.nextInt(ramValues.length)], storageValues[random.nextInt(storageValues.length)], random.nextBoolean(), screenSizeValues[random.nextInt(screenSizeValues.length)]);
        }
        fridgeStock = new Fridge[3];
        for(int i=0; i<fridgeStock.length; i++){
            fridgeStock[i] = new Fridge(fridgeSizes[random.nextInt(fridgeSizes.length)], random.nextBoolean(), colorValues[random.nextInt(colorValues.length)]);
        }

    }
    //a void method called printStock() that will iterate over all of the store’s stock
    public void printStock(){
        for(int i=0; i<desktopStock.length; i++){
            System.out.println(desktopStock[i].toString());
        }
        for(int i=0; i<laptopStock.length; i++){
            System.out.println(laptopStock[i].toString());
        }
        for(int i=0; i<fridgeStock.length; i++){
            System.out.println(fridgeStock[i].toString());
        }
    }

    public String genInventoryString(){
        String inventory = " ";
        for(int i=0; i<3; i++){
            inventory = inventory + desktopStock[i].toString() + " " + laptopStock[i].toString() + " " + fridgeStock[i].toString();
        }
        return  inventory;
    }

    public boolean searchStock(String item){
        String inventory = genInventoryString().toUpperCase();
        item = item.toUpperCase();
        return inventory.contains(item);
    }











}
