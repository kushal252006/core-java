class CookingOil {
    public CookingOil() {
        this("Sunflower Oil");
        System.out.println("First constructor");
    }
    public CookingOil(String oilName) {
        this("Fortune", "Dhara");
        System.out.println("Second constructor");
        System.out.println("Oil Name: " + oilName);
    }
    public CookingOil(String brand1, String brand2) {
        this(1.5, 2.0, 5.0);
        System.out.println("Third constructor");
        System.out.println("Brand 1: " + brand1);
        System.out.println("Brand 2: " + brand2);
    }
    public CookingOil(double litre1, double litre2, double litre3) {
        this(120, 240, 500, 900);
        System.out.println("Fourth constructor");
        System.out.println("Oil Quantity: " + litre1 + "L");
        System.out.println("Oil Quantity: " + litre2 + "L");
        System.out.println("Oil Quantity: " + litre3 + "L");
    }
    public CookingOil(int price1, int price2, int price3, int price4) {
        this(true, false, true, false, true);
        System.out.println("Fifth constructor");
        System.out.println("Price 1: " + price1);
        System.out.println("Price 2: " + price2);
        System.out.println("Price 3: " + price3);
        System.out.println("Price 4: " + price4);
    }
    public CookingOil(boolean a, boolean b, boolean c, boolean d, boolean e) {
        System.out.println("Last constructor");
        System.out.println("Available in Store 1: " + a);
        System.out.println("Available in Store 2: " + b);
        System.out.println("Available in Store 3: " + c);
        System.out.println("Available in Store 4: " + d);
        System.out.println("Available in Store 5: " + e);
    }
}