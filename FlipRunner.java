 class FlipRunner{
 public static void main(String[] args) {
Flipkart fk1 = new Flipkart("TV", (short)601, true, 90001L, 10.5f);
fk1.showInfo();
Flipkart fk2 = new Flipkart("Laptop", (short)602, false, 90002L, 15.0f);
fk2.showInfo();
Flipkart fk3 = new Flipkart("Camera", (short)603, true, 90003L, 8.5f);
fk3.showInfo();
Flipkart fk4 = new Flipkart("Tablet", (short)604, false, 90004L, 12.0f);
fk4.showInfo();
Flipkart fk5 = new Flipkart("Headset", (short)605, true, 90005L, 5.0f);
fk5.showInfo();
    }
}