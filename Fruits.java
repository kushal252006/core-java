class Fruits {
    String fruitName;
    byte fruitCode;
    boolean isSeasonal;
    short quantity;
    double pricePerKg;
    public Fruits(String f1, byte f2, boolean f3, short f4, double f5) {
fruitName = f1;
fruitCode = f2;
isSeasonal = f3;
quantity = f4;
pricePerKg = f5; }
    public void displayFruit() {
        System.out.println("Fruit Name: " + fruitName);
        System.out.println("Fruit Code: " + fruitCode);
        System.out.println("Seasonal: " + isSeasonal);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Kg: " + pricePerKg);
        System.out.println("----------------------");
    }
}