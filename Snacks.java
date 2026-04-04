class Snacks {  
    public Snacks() {
        this("Chips");
        System.out.println("First constructor with one par ");
    }
    public Snacks(String snackName) {
        this("Lays", "Kurkure");
        System.out.println("Second constructor with 2 par");
        System.out.println("Snack Name: " + snackName);
    }
    public Snacks(String brand1, String brand2) {
        this(1, 2, 3);
        System.out.println("Third constructor with 3 par");
        System.out.println("Brand 1: " + brand1);
        System.out.println("Brand 2: " + brand2);
    }
    public Snacks(int size1, int size2, int size3) {
        this(10.5f, 20.0f, 30.5f, 40.0f);
        System.out.println("Fourth constructor");
        System.out.println("Packet Size 1: " + size1 + "g");
        System.out.println("Packet Size 2: " + size2 + "g");
        System.out.println("Packet Size 3: " + size3 + "g");
    }
    public Snacks(float price1, float price2, float price3, float price4) {
        this('S', 'A', 'B', 'A', 'C');
        System.out.println("Fifth constructor");
        System.out.println("Price 1: " + price1);
        System.out.println("Price 2: " + price2);
        System.out.println("Price 3: " + price3);
        System.out.println("Price 4: S" + price4);
    }  
    public Snacks(char grade1, char grade2, char grade3, char grade4, char grade5) {
        System.out.println("Last constructor");
        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Grade 3: " + grade3);
        System.out.println("Grade 4: " + grade4);
        System.out.println("Grade 5: " + grade5);
    }
}