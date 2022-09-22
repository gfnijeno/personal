import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {

        System.out.println("Welcome to Angels Pizza!");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a Creamy Spinach Pizza that costs 400.00 pesos");
        System.out.println("Enter B if you want a Four Cheese Pizza that costs 300.00 pesos");

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);

        String pizza = "";
        double price = 0;

        switch (choice) {
            case 'A':
                pizza = "Creamy Spinach Pizza";
                price = 400.00;
                break;
            case 'B':
                pizza = "Four Cheese Pizza";
                price = 300.00;
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }

        System.out.println("Type H for hand-tossed.");
        System.out.println("Type T for thin crust. ");
        System.out.println("Crust (Choose 1): ");

        char type = scan.next().charAt(0);
        
        String crust = "";
        switch(type) {
            case 'H':
            crust = "Hand-tossed";
            break;
            case 'T':
            crust = "Thin crust";
        }

        System.out.println("Type 'M' for Medium (9-inch)");
        System.out.println("Type 'F' for Family (12-inch)");
        System.out.println("Type 'B' for Big Family (14-inch)");
        System.out.println("Size (Choose 1):");

        char inch = scan.next().charAt(0);
        
        String size = "";
        switch(inch) {
            case 'M':
            size = "Medium (9-inch)";
            break;
            case 'F':
            size = "Family (12-inch)";
            break;
            case 'B':
            size = "Big Family (14-inch)";
        }

        System.out.print("Enter the quantity: ");
        int quantity = scan.nextInt();

        

        System.out.println("Your order is: " + quantity + " " + crust + " " + size + " " + pizza);
        System.out.println("Your total amount is: " + (quantity*price));

        scan.close();
    }
}
