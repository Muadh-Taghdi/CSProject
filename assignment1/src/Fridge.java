public class Fridge {
    double size;
    boolean freezer;
    String color;

    public Fridge(){
    }

    public Fridge(double initSize, boolean initFreezer, String initColor){
        size = initSize;
        freezer = initFreezer;
        color = initColor;
    }

    public String toString(){
        String withFreezer = "with Freezer ";
        if(!freezer){
            withFreezer = "";
        }
        return (size + " cubic foot Fridge " + withFreezer + "(" + color + ")");
    }
}
