public class Item {
    int price;
    int weight;
    int quantity;
    String description;
    boolean canbetraded;
    String name;

    public void itemdescription() {
        System.out.println("This is a " + name + ". It is worth " + price + " pesos. It weighs " + weight + " kilograms, I have " + quantity + " pieces." + description + " Can it be traded? " + canbetraded);
    }


}
