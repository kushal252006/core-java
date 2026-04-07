class DryFruits {
    static void showFruitDetails() {
        String fruitName = "Almonds";
System.out.println("Dry fruit name: " + fruitName);
displayWeight(500);
    }
static void displayWeight(int grams) {
        System.out.println("Weight in grams: " + grams);
double price = getPricePerKg();
System.out.println("Price per kg returned: " + price);
    }

static double getPricePerKg() {
double price = 1200.50;
System.out.println("Price per kg: " + price);
        return price;
    }
}
   