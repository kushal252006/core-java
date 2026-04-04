class Vegetables {
public Vegetables() {
this("Carrot");
System.out.println("First constructor");
}
public Vegetables(String vegName) {
this("Tomato", "Potato");
System.out.println("Second constructor");
System.out.println("Vegetable Name: " + vegName);
}
public Vegetables(String veg1, String veg2) {
this(2.5f, 3.0f, 1.5f);
System.out.println("Third constructor");
System.out.println("Vegetable 1: " + veg1);
System.out.println("Vegetable 2: " + veg2);
}
public Vegetables(float weight1, float weight2, float weight3) {
this(20, 30, 40, 50);
System.out.println("Fourth constructor");
System.out.println("Weight 1: " + weight1 + " kg");
System.out.println("Weight 2: " + weight2 + " kg");
System.out.println("Weight 3: " + weight3 + " kg");
}
public Vegetables(int price1, int price2, int price3, int price4) {
this('A', 'B', 'A', 'C', 'B');
System.out.println("Fifth constructor");
System.out.println("Price 1: " + price1);
System.out.println("Price 2: " + price2);
System.out.println("Price 3: " + price3);
System.out.println("Price 4: " + price4);
}
public Vegetables(char grade1, char grade2, char grade3, char grade4, char grade5) {
System.out.println("Last constructor");
System.out.println("Grade 1: " + grade1);
System.out.println("Grade 2: " + grade2);
System.out.println("Grade 3: " + grade3);
System.out.println("Grade 4: " + grade4);
System.out.println("Grade 5: " + grade5);
    }
}