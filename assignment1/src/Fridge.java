public class Fridge {
    double size;
    boolean freezer;
    String color;

    //zero-argument constructor
    public Fridge(){
    }

    //three-argument constructor
    public Fridge(double initSize, boolean initFreezer, String initColor){
        size = initSize;
        freezer = initFreezer;
        color = initColor;
    }

    //toString method
    public String toString(){
        String withFreezer = "with Freezer ";
        if(!freezer){
            withFreezer = "";
        }
        return (size + " cubic foot Fridge " + withFreezer + "(" + color + ")");
    }
}
