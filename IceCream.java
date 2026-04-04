class IceCream { 
    public IceCream() {
        this("Chocolate");
        System.out.println("First constructor");
    }

   
    public IceCream(String flavor) {
        this("Amul", "Kwality Walls");
        System.out.println("Second constructor");
        System.out.println("Flavor: " + flavor);
    }

    
    public IceCream(String brand1, String brand2) {
        this(99.5, 149.0, 199.5);
        System.out.println("Third constructor");
        System.out.println("Brand 1: " + brand1);
        System.out.println("Brand 2: " + brand2);
    }

    
    public IceCream(double price1, double price2, double price3) {
        this(1, 2, 3, 4);
        System.out.println("Fourth constructor");
        System.out.println("Price 1: ₹" + price1);
        System.out.println("Price 2: ₹" + price2);
        System.out.println("Price 3: ₹" + price3);
    }

    
    public IceCream(int scoop1, int scoop2, int scoop3, int scoop4) {
        this(true, false, true, true, false);
        System.out.println("Fifth constructor");
        System.out.println("Scoops 1: " + scoop1);
        System.out.println("Scoops 2: " + scoop2);
        System.out.println("Scoops 3: " + scoop3);
        System.out.println("Scoops 4: " + scoop4);
    }
    public IceCream(boolean s1, boolean s2, boolean s3, boolean s4, boolean s5) {
        System.out.println("Last constructor");
        System.out.println("Available in Shop 1: " + s1);
        System.out.println("Available in Shop 2: " + s2);
        System.out.println("Available in Shop 3: " + s3);
        System.out.println("Available in Shop 4: " + s4);
        System.out.println("Available in Shop 5: " + s5);
    }
}