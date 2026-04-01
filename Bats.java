class Bats {
    String brand;
    short batCode;
    boolean isAvailable;
    byte stock;
    double weight;
    public Bats(String b1, short b2, boolean b3, byte b4, double b5) {
        brand = b1;
        batCode = b2;
        isAvailable = b3;
        stock = b4;
        weight = b5;
    }
    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Bat Code: " + batCode);
        System.out.println("Available: " + isAvailable);
        System.out.println("Stock: " + stock);
        System.out.println("Weight: " + weight);
        System.out.println("----------------------");
    }
}