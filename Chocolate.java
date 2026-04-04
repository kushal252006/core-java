class Chocolate {
public Chocolate() {
this("Dairy Milk");
System.out.println("First constructor");
}
public Chocolate(String chocoName) {
this("Cadbury", "Nestle");
System.out.println("Second constructor");
System.out.println("Chocolate Name: " + chocoName);
}
public Chocolate(String brand1, String brand2) {
this(10.5, 20.0, 50.5);
System.out.println("Third constructor");
System.out.println("Brand 1: " + brand1);
System.out.println("Brand 2: " + brand2);
  }
public Chocolate(double weight1, double weight2, double weight3) {
this(20, 40, 60, 80);
System.out.println("Fourth constructor");
System.out.println("Weight 1: " + weight1 + "g");
System.out.println("Weight 2: " + weight2 + "g");
System.out.println("Weight 3: " + weight3 + "g");
}
public Chocolate(int price1, int price2, int price3, int price4) {
this(true, false, true, false, true);
System.out.println("Fifth constructor");
System.out.println("Price 1: " + price1);
System.out.println("Price 2: " + price2);
System.out.println("Price 3: " + price3);
System.out.println("Price 4: " + price4);
}
public Chocolate(boolean s1, boolean s2, boolean s3, boolean s4, boolean s5) {
System.out.println("Last constructor");
System.out.println("Available in Shop 1: " + s1);
System.out.println("Available in Shop 2: " + s2);
System.out.println("Available in Shop 3: " + s3);
System.out.println("Available in Shop 4: " + s4);
System.out.println("Available in Shop 5: " + s5);
    }
}