import java.util.Scanner;

public class ElectronicStoreTester {
    public static void main(String args[]) {

        // instantiating the ElectronicStore class
        ElectronicStore store1 = new ElectronicStore("BestBuy");
        System.out.println("The store stock includes:");
        store1.printStock();
        System.out.println("");


        Scanner myScanner = new Scanner(System.in); // creating a scanner object;
        while (true) {
            System.out.println("Enter a term to search for: ");
            String input = myScanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            if (store1.searchStock(input)) {
                System.out.println("A matching item is contained in the store's stock.");
            } else {
                System.out.println("No items in the store's stock match that term.");
            }
        }
    }
}
