class Egg {
    static void showEggDetails() {
String eggType = "Brown Egg";
System.out.println("Egg type: " + eggType);
displayQuantity(12);
}
static void displayQuantity(int count) {
System.out.println("Number of eggs: " + count);
double price = getPricePerDozen();
System.out.println("Price returned: " + price);
}
    static double getPricePerDozen() {
double price = 120.50;
System.out.println("Price per dozen: " + price);
return price;
}
}