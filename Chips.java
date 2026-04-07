class Chips {
    static void showChipsDetails() {
        String brand = "Lays";
        System.out.println("Chips brand: " + brand);
        displayWeight(200);
    }
    static void displayWeight(int grams) {
        System.out.println("Weight in grams: " + grams);
        double price = getPrice();
        System.out.println("Price returned: " + price);
    }
    static double getPrice() {
        double price = 50.75;
        System.out.println("Price of chips: " + price);
        return price;
    }
}